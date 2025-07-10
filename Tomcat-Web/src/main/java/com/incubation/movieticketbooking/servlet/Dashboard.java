package com.incubation.movieticketbooking.servlet;

import com.incubation.movieticketbooking.data.db.AppDb;
import com.incubation.movieticketbooking.data.dto.Show;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {

    private final AppDb appDb = AppDb.getInstance();

    public Dashboard() throws SQLException {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Show> showsList = null;
        try {
            showsList = appDb.getAllShows();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("shows", showsList);
        req.getRequestDispatcher("/WEB-INF/html/dashboard.jsp").forward(req, resp);
    }
}
