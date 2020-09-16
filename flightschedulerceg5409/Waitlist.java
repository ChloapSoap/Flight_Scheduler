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
public class Waitlist {
    private String name;
    private int position;
    
    public Waitlist() {}
    public Waitlist(String name, int position) {
        setWaitlistName(name);
        setWaitlistPosition(position);
    }
    
    public void setWaitlistName(String name) {
        this.name = name;
    }
    
    public void setWaitlistPosition(int position) {
        this.position = position;
    }
    
    public String getWaitlistName() {
        return name;
    }
    
    public int getWaitlistPosition() {
        return position;
    }
}
