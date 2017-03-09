/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Marienne Lopez
 */
public class DatabaseManager {
    
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://localhost:3306/crimeapp";
    
    final String USER = "admin";
    final String PASS = "admin";
    
    private Connection conn;
    private Statement stmt;
    
    public DatabaseManager(){
        try{
            System.out.println("Initializing db....");
            Class.forName(JDBC_DRIVER).newInstance();
            
            System.out.println("Connecting to db...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to db!");
            
            this.stmt = conn.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void insertLoc(String locname){
        String sql = "INSERT INTO loc_name(name) VALUE ('" 
                + locname + "');";
        try{
            stmt.executeUpdate(sql);
            System.out.println("Successfully inserted " + locname +
                    " into table loc_name");
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public ArrayList<Location> getLoc(){
        String sql = "SELECT * FROM loc_name;";
        ResultSet rs = null;
        ArrayList<Location> loc_list = new ArrayList<>();
        try{
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("Location!!!");
                int id = rs.getInt("id");
                System.out.println(id);
                String name = rs.getString("name");
                System.out.println(name);
                Location l = new Location(name, id);
                loc_list.add(l);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return loc_list;
    }
    
    public int getLocID(String name){
        String sql = "SELECT id FROM loc_name WHERE name='" +
                name + "';";
        System.out.println(sql);
        ResultSet rs = null;
        int id = -1;
        try{
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                id = rs.getInt("id");
                System.out.println("There is a result!!!@");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return id;
    }
    
    public String getLocName(int id){
        String result = "";
        String sql = "SELECT name FROM loc_name WHERE id=" + id + ";";
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                result = rs.getString("name");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    
    public void insertCoords(double x, double y, String name){
        int id = getLocID(name);
        String sql = "";
        if (id > -1){
            try{
                id = getLocID(name);
                sql = "INSERT INTO coords(x, y, loc_id) VALUES (" +
                        x + ", " +
                        y + ", " +
                        id + ");";
                stmt.executeUpdate(sql);
            } catch(Exception e){
                e.printStackTrace();
            }
        } else{
            System.out.println("Cannot insert new entry as " +
                    name + " is not a valid location.");
        }
    }
    
    public int getCoordID(double x, double y){
        int id = -1;
        String sql = "SELECT coord_id FROM coords WHERE x=" +
                x + " AND y=" + y + ";";
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                id = rs.getInt("coord_id");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return id;
    }
    
    public ArrayList<CrimeInfo> getCoords(){
        ArrayList<CrimeInfo> crimelist = new ArrayList<>();
        ArrayList<Integer> crimelocid = new ArrayList<Integer>();
        ArrayList<Double> xs = new ArrayList<Double>();
        ArrayList<Double> ys = new ArrayList<Double>();
        String sql = "SELECT * FROM coords;";
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                xs.add(rs.getDouble("x"));
                ys.add(rs.getDouble("y"));
                crimelocid.add(rs.getInt("loc_id"));
//                double x = rs.getDouble("x");
//                double y = rs.getDouble("y");
////                String loc_name = getLocName(rs.getInt("loc_id"));
//                int locid = rs.getInt("loc_id");
            }
            if(crimelocid.size()>0){
                for(int i=0; i<crimelocid.size(); i++){
                    String loc_name = getLocName(crimelocid.get(i));
                    CrimeInfo c = new CrimeInfo(xs.get(i), 
                        ys.get(i), loc_name);
                    crimelist.add(c);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return crimelist;
    }
    
    public ArrayList<CrimeInfo> getCoordsFromLocID(int id){
        ArrayList<CrimeInfo> crimelist = new ArrayList<>();
        ArrayList<Integer> crimelocid = new ArrayList<Integer>();
        ArrayList<Double> xs = new ArrayList<Double>();
        ArrayList<Double> ys = new ArrayList<Double>();
        String sql = "SELECT * FROM coords WHERE loc_id="+ id + ";";
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                xs.add(rs.getDouble("x"));
                ys.add(rs.getDouble("y"));
                crimelocid.add(rs.getInt("loc_id"));
//                double x = rs.getDouble("x");
//                double y = rs.getDouble("y");
////                String loc_name = getLocName(rs.getInt("loc_id"));
//                int locid = rs.getInt("loc_id");
            }
            if(crimelocid.size()>0){
                for(int i=0; i<crimelocid.size(); i++){
                    String loc_name = getLocName(crimelocid.get(i));
                    CrimeInfo c = new CrimeInfo(xs.get(i), 
                        ys.get(i), loc_name);
                    crimelist.add(c);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return crimelist;
    }

    
    
    

}
