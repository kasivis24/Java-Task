package com.incubation.movieticketbooking.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {"/dashboard", "/userprofile"})
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String path = req.getRequestURI();

        HttpSession session = req.getSession(false);

        boolean isLoggedIn = (session != null && session.getAttribute("userToken") != null);

        if (session != null) {
            System.out.println(session.getAttribute("userToken"));
        }

        if (isLoggedIn) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            res.sendRedirect(req.getContextPath() + "/html/login.html");
        }
    }
}
