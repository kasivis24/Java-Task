<%@ page import="java.util.*, com.incubation.movieticketbooking.data.dto.Show" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show Booking Dashboard</title>

    <!-- CSS -->
    <link rel="stylesheet" href="/movieticketbooking/css/dashboard.css" />
    <link rel="stylesheet" href="/movieticketbooking/css/dialog.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
</head>
<body>


<header>
    <a href="#" class="logo">BookMyShow</a>

    <nav>
        <a href="#">Home</a>
        <a href="#">Shows</a>
        <a href="#">Book Tickets</a>
        <a href="#">Contact</a>
    </nav>

    <div class="search-box">
        <input type="text" placeholder="Search shows...">
    </div>


    <div class="user-icon">
        <a href="#" id="userIcon"><i class="fas fa-user-circle fa-2x"></i></a>
    </div>
</header>

<div id="userDialog" class="dialog">
    <div class="dialog-content">
        <span class="close">&times;</span>
        <h2>User Details</h2>
        <p><strong>Name:</strong> <span id="userName"></span></p>
        <p><strong>Email:</strong> <span id="userEmail"></span></p>
    </div>
</div>


<section class="movies">
    <h2>Now Showing</h2>
    <div class="movie-grid">
        <%
        List<Show> shows = (List<Show>) request.getAttribute("shows");
        if (shows != null && !shows.isEmpty()) {
            for (Show show : shows) {
        %>
        <div class="movie-card">
            <%
                String imageUrl = show.getImageUrl();
                if (imageUrl.startsWith("http")) {
            %>
                <img src="<%= imageUrl %>" alt="Show Poster" class="show-thumbnail">
            <%
                } else {
            %>
                <img src="<%= request.getContextPath() + "/" + imageUrl %>" alt="Show Poster" class="show-thumbnail">
            <%
                }
            %>

            <h3><%= show.getMovieName() %></h3>
            <p><strong>Theatre:</strong> <%= show.getTheatreName() %></p>
            <p><strong>Date & Time:</strong> <%= show.getDateAndTime() %></p>
            <p><strong>Price:</strong> ₹<%= show.getPrice() %></p>
            <p><strong>Available Seat:</strong><%= show.getAvailableSeats()%></p>
            <button class="bookTicket">Book Tickets</button>
        </div>
        <%
            }
        } else {
        %>
        <p style="color: #ccc;">No shows available at the moment.</p>
        <%
        }
        %>
    </div>
</section>

<script src="<%= request.getContextPath() %>/js/dashboard.js"></script>

</body>
</html>
