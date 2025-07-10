package com.incubation.movieticketbooking.data.dto;

public class Show {
    private int showId;
    private String movieName;
    private String theatreName;
    private String dateAndTime;
    private String imageUrl;
    private int price;
    private int availableSeats;

    public Show(int showId, String movieName, String theatreName, String dateAndTime, String imageUrl, int price, int availableSeats) {
        this.showId = showId;
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.dateAndTime = dateAndTime;
        this.imageUrl = imageUrl;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
