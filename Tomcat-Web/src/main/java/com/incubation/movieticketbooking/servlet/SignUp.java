package com.incubation.movieticketbooking.servlet;

import com.incubation.movieticketbooking.data.db.AppDb;
import com.incubation.movieticketbooking.data.dto.UserData;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.UUID;

import com.google.gson.Gson;
import jakarta.servlet.http.HttpSession;

@WebServlet("/signup")
public class SignUp extends HttpServlet {

    private final AppDb appDb = AppDb.getInstance();

    public SignUp() throws SQLException {
        super();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println(req.getContextPath());

        System.out.println("Name -> "+req.getParameter("name"));

        BufferedReader reader = req.getReader();
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        String json = sb.toString();
        UserData data = new Gson().fromJson(json, UserData.class);

        String username = data.getName();
        String email = data.getEmail();
        String password = data.getPassword();


        System.out.println(username);
        System.out.println(email);
        System.out.println(password);

        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();

        if (username != null && email != null && password != null && !username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            try {
                String userUid = UUID.randomUUID().toString();
                appDb.addUserData(new UserData(userUid,username,email,password));
                HttpSession session = req.getSession();
                session.setAttribute("userToken", userUid);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            out.print("Signup successful");

        } else {
            out.print("Signup Failed");
        }


    }
}
