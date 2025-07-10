package javaclassandobject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FlightDTO {
    private int flightNumber;
    private String airline;
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureTime;
    private double arrivalTime;
    private long duration;
    private double price;
    private String status;
    private String aircraftType;

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public static void main(String[] args) {
        FlightDTO flight = new FlightDTO();

        flight.setAircraftType("Air India 805");
        System.out.println("AirCraft Type : "+ flight.getAircraftType());

        flight.setAirline("Emirates");
        System.out.println("Air Line : "+ flight.getAirline());

        flight.setFlightNumber(1223);
        System.out.println("Flight Number : "+ flight.getFlightNumber());

        flight.setDepartureAirport("Chennai");
        System.out.println("Departure AirPort : "+ flight.getDepartureAirport());

        flight.setArrivalAirport("USA");
        System.out.println("Arrival AirPort : "+flight.getArrivalAirport());

        flight.setPrice(25000);
        System.out.println("Flight : "+ flight.getPrice());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d'nd' MMMM yyyy 'at' HH:mm.ss");
        LocalDateTime departure = LocalDateTime.parse("10nd March 2025 at 03:45.30",formatter);

        flight.setDepartureTime(departure);
        System.out.println("Departure Time : "+ flight.getDepartureTime());

        flight.setArrivalTime(3.48);
        System.out.println("Arrival Time : "+ flight.getArrivalTime());

        flight.setStatus("Ready To Take Off");
        System.out.println("Status : "+ flight.getStatus());

        flight.setDuration(24);
        System.out.println("Duration : "+ flight.getDuration());
    }
}