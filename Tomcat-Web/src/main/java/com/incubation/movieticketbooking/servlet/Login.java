package com.incubation.movieticketbooking.servlet;

import com.google.gson.Gson;
import com.incubation.movieticketbooking.data.db.AppDb;
import com.incubation.movieticketbooking.data.dto.LoginInfo;
import com.incubation.movieticketbooking.data.dto.UserData;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/login")
public class Login extends HttpServlet {

    private final AppDb appDb = AppDb.getInstance();

    public Login() throws SQLException {
        super();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Data");
        BufferedReader reader = req.getReader();
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        String json = sb.toString();
        LoginInfo data = new Gson().fromJson(json, LoginInfo.class);

        String email = data.getEmail();
        String password = data.getPassword();


        System.out.println(email);
        System.out.println(password);

        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();

        if (email != null && password != null && !email.isEmpty() && !password.isEmpty()) {

            try {
                if (appDb.loginVerify(new LoginInfo(email,password))){
                    out.print("Login successful");
                    String userUid = appDb.getUserUid(email);
                    HttpSession session = req.getSession();
                    session.setAttribute("userToken", userUid);
                }else {
                    out.print("Signup Failed");
                }
            } catch (SQLException e) {
                out.print("Signup Failed");
                throw new RuntimeException(e);
            }

        } else {
            out.print("Signup Failed");
        }
    }
}
