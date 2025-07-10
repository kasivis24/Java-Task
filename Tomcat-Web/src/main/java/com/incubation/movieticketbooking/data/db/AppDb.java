package com.incubation.movieticketbooking.data.db;

import com.incubation.movieticketbooking.data.dbconfig.DBConnection;
import com.incubation.movieticketbooking.data.dto.LoginInfo;
import com.incubation.movieticketbooking.data.dto.Show;
import com.incubation.movieticketbooking.data.dto.UserData;
import com.incubation.movieticketbooking.data.dto.UserProfileInfo;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AppDb {
    private static AppDb instance = null;
    private static Connection conn;

    private AppDb() throws SQLException {
        try {
            System.out.println("Fun");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Now ");
            conn = DBConnection.getConnection();
            System.out.println("Now ");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static AppDb getInstance() throws SQLException {
        if (instance == null) instance = new AppDb();
        return instance;
    }

    public static List<Show> getAllShows() throws SQLException {
        List<Show> showList = new ArrayList<>();
        String sql = "SELECT s.show_id, m.title AS movie_name, t.name AS theatre_name, m.image_url AS movie_imageUrl, " +
                "s.show_time, s.base_price, s.available_seats " +
                "FROM shows s " +
                "JOIN movies m ON s.movie_id = m.movie_id " +
                "JOIN theatres t ON s.theatre_id = t.theatre_id";


        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int showId = rs.getInt("show_id");
                String movieName = rs.getString("movie_name");
                String theatreName = rs.getString("theatre_name");
                String dateAndTime = rs.getString("show_time");
                String imageUrl = rs.getString("movie_imageUrl");
                int price = rs.getBigDecimal("base_price").intValue();
                int availableSeats = rs.getInt("available_seats");

                Show show = new Show(showId, movieName, theatreName, dateAndTime, imageUrl,price, availableSeats);
                showList.add(show);
            }

        return showList;
    }

    public void addUserData(UserData userData) throws SQLException {

        String hashedPassword = BCrypt.hashpw(userData.getPassword(), BCrypt.gensalt(12));

        String sql = "INSERT INTO movieUserData (userUid, username, email, password) VALUES (?, ?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,userData.getUserUid());
        stmt.setString(2,userData.getName());
        stmt.setString(3,userData.getEmail());
        stmt.setString(4,hashedPassword);
        stmt.executeUpdate();
    }

    public boolean loginVerify(LoginInfo loginInfo) throws  SQLException{
        String sql = "SELECT * FROM movieUserData WHERE email = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, loginInfo.getEmail());
        ResultSet rs = stmt.executeQuery();

        String enteredPassword = loginInfo.getPassword();

        if (rs.next()) {

            String hashedPassword = rs.getString("password");

            if (BCrypt.checkpw(enteredPassword, hashedPassword)) {
                System.out.println("Login successful");
                return true;
            } else {
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("Invalid username or password");
        }
        return false;
    }

    public String getUserUid(String email) throws SQLException {
        String sql = "SELECT * FROM movieUserData WHERE email = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, email);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            String userUid = rs.getString("userUid");
            return userUid;
        }
        System.out.println("Invalid username or password");
        return "";
    }

    public UserProfileInfo getUserProfile(String userUid) throws SQLException {
        String sql = "SELECT * FROM movieUserData WHERE userUid = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, userUid);
        ResultSet rs = stmt.executeQuery();
        UserProfileInfo userProfileInfo = null;
        if (rs.next()) {
            userProfileInfo = new UserProfileInfo(rs.getString("username"),rs.getString("email"));
        }
        return userProfileInfo;
    }



}
