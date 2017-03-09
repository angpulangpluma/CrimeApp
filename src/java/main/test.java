/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marienne Lopez
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DatabaseManager dbmngr;
        dbmngr = new DatabaseManager();
//        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    String DB_URL = "jdbc:mysql://localhost:3306/crimeapp";
//    
//    String USER = "admin";
//    String PASS = "admin";
//    
//    Connection conn;
//    Statement stmt;
//    
//    try{
////            System.out.println("Initializing db....");
//            Class.forName("com.mysql.jdbc.Driver");
//            
//            System.out.println("Connecting to db...");
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            System.out.println("Connected to db!");
//            
//            stmt = conn.createStatement();
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//        ArrayList<String> loc_list;
//        
        System.out.println("Adding 'makati' as location.");
        dbmngr.insertLoc("Makati");
        System.out.println("Adding 'manila' as location.");
        dbmngr.insertLoc("Manila");
        System.out.println("Adding 'pasay' as location.");
        dbmngr.insertLoc("Pasay");
        System.out.println("Adding 'stc' as location.");
        dbmngr.insertLoc("STC");
        
//        System.out.println("Adding a point under 'laguna'");
//        dbmngr.insertCoords(14.26247036524762, -121.04294174415632, "Laguna");
        
    }

}
