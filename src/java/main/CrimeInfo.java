/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author Marienne Lopez
 */
public class CrimeInfo {
    
    private double x;
    private double y;
    private String crimename;
    private String loc;
    
    public CrimeInfo(){
        
    }
    
    public CrimeInfo(double x, double y, String crimename, String loc){
        this.x = x;
        this.y = y;
        this.crimename = crimename;
        this.loc = loc;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public void setCrimeName(String crimename){
        this.crimename = crimename;
    }
    
    public void setLoc(String loc){
        this.loc = loc;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public String getCrimeName(){
        return this.crimename;
    }
    
    public String getLoc(){
        return this.loc;
    }

}
