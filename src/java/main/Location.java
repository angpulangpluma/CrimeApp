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
public class Location {
    
    private String loc_name;
    private int loc_id;
    
    public Location(String loc_name, int loc_id){
        this.loc_name = loc_name;
        this.loc_id = loc_id;
    }
    
    public void setLocID(int id){
        this.loc_id = id;
    }
    
    public void setLocName(String name){
        this.loc_name = name;
    }
    
    public int getLocID(){
        return this.loc_id;
    }
    
    public String getLocName(){
        return this.loc_name;
    }

}
