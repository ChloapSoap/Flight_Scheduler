/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulerceg5409;

/**
 *
 * @author Chloe
 */
public class Flight {
    private String flightName;
    private int seats;
    
    //constructor
    public Flight() {
    }
    
    public Flight(String flightName, int seats) {
        setFlightName(flightName);
        setSeats(seats);
    }
    
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    
    public String getFlightName() {
        return flightName;
    }
    
    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    public int getSeats() {
        return seats;
    }
}
