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
public class Day {
    private String flightDate;
    
    //constructor
    public Day() {}
    public Day(String flightDate) {
        setFlightDate(flightDate);
    }
    
    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }
    
    public String getFlightDate() {
        return flightDate;
    }
}
