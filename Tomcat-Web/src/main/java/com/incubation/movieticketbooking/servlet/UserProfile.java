package com.incubation.movieticketbooking.servlet;

import com.google.gson.Gson;
import com.incubation.movieticketbooking.data.db.AppDb;
import com.incubation.movieticketbooking.data.dto.UserProfileInfo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/userprofile")
public class UserProfile extends HttpServlet {

    private final Gson gson = new Gson();

    private final AppDb appDb = AppDb.getInstance();

    public UserProfile() throws SQLException {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        HttpSession session = req.getSession();
        String userUid = (String) session.getAttribute("userToken");
        UserProfileInfo profileInfo = null;
        try {
            profileInfo = appDb.getUserProfile(userUid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String json = gson.toJson(profileInfo);
        resp.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
