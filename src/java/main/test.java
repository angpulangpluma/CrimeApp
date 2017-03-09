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
//        System.out.println("Adding 'makati' as location.");
//        dbmngr.insertLoc("Makati");
//        System.out.println("Adding 'manila' as location.");
//        dbmngr.insertLoc("Manila");
//        System.out.println("Adding 'pasay' as location.");
//        dbmngr.insertLoc("Pasay");
//        System.out.println("Adding 'stc' as location.");
//        dbmngr.insertLoc("STC");
//        
//        //sample laguna points
//        System.out.println("Adding a point under 'laguna'");
//        dbmngr.insertCoords(14.1760647, 121.1885007, "Laguna");
//        System.out.println("Adding a point under 'laguna'");
//        dbmngr.insertCoords(14.1768397, 121.1874118, "Laguna");
//        System.out.println("Adding a point under 'laguna'");
//        dbmngr.insertCoords(14.1764704, 121.1830666, "Laguna");
//        System.out.println("Adding a point under 'laguna'");
//        dbmngr.insertCoords(14.1753234, 121.1732075, "Laguna");
//        System.out.println("Adding a point under 'laguna'");
//        dbmngr.insertCoords(14.1722037, 121.3396407, "Laguna");
//        
//        //sample makati points
//        System.out.println("Adding a point under 'makati'");
//        dbmngr.insertCoords(14.5489068, 121.0245375, "Makati");
//        System.out.println("Adding a point under 'makati'");
//        dbmngr.insertCoords(14.5501634, 121.0235397, "Makati");
//        System.out.println("Adding a point under 'makati'");
//        dbmngr.insertCoords(14.5537461, 121.022499, "Makati");
//        System.out.println("Adding a point under 'makati'");
//        dbmngr.insertCoords(14.5520326, 121.0225848, "Makati");
//        System.out.println("Adding a point under 'makati'");
//        dbmngr.insertCoords(14.5542747, 121.0206858, "Makati");
//        
//        //sample manila points
//        System.out.println("Adding a point under 'manila'");
//        dbmngr.insertCoords(14.6051468, 121.0061517, "Manila");
//        System.out.println("Adding a point under 'manila'");
//        dbmngr.insertCoords(14.6041398, 121.0057226, "Manila");
//        System.out.println("Adding a point under 'manila'");
//        dbmngr.insertCoords(14.6027382, 121.0034373, "Manila");
//        System.out.println("Adding a point under 'manila'");
//        dbmngr.insertCoords(14.6048042, 121.0033837, "Manila");
//        System.out.println("Adding a point under 'manila'");
//        dbmngr.insertCoords(14.6044928, 121.0016885, "Manila");
//        
//        //sample pasay points
//        System.out.println("Adding a point under 'pasay'");
//        dbmngr.insertCoords(14.5300758, 121.0044371, "Pasay");
//        System.out.println("Adding a point under 'pasay'");
//        dbmngr.insertCoords(14.5304808, 121.0044317, "Pasay");
//        System.out.println("Adding a point under 'pasay'");
//        dbmngr.insertCoords(14.5279935, 121.0034715, "Pasay");
//        System.out.println("Adding a point under 'pasay'");
//        dbmngr.insertCoords(14.5298369, 120.9912728, "Pasay");
//        System.out.println("Adding a point under 'pasay'");
//        dbmngr.insertCoords(14.5317427, 120.9893094, "Pasay");
//        
//        //sample stc points
//        System.out.println("Adding a point under 'stc'");
//        dbmngr.insertCoords(14.2629217, 121.0435971, "STC");
//        System.out.println("Adding a point under 'stc'");
//        dbmngr.insertCoords(14.2623271, 121.0435969, "STC");
//        System.out.println("Adding a point under 'stc'");
//        dbmngr.insertCoords(14.2624226, 121.0439404, "STC");
//        System.out.println("Adding a point under 'stc'");
//        dbmngr.insertCoords(14.2624226, 121.0436722, "STC");
//        System.out.println("Adding a point under 'stc'");
//        dbmngr.insertCoords(14.2622355, 121.0418912, "STC");
        
        ArrayList<CrimeInfo> crimelist = null;
        ArrayList<Location> loclist = dbmngr.getLoc();
        
//        for (int i=0; i<crimelist.size(); i++){
//            CrimeInfo c = crimelist.get(i);
//            System.out.println(i+1 + "th element:");
//            System.out.println("x - " + c.getX());
//            System.out.println("y - " + c.getY());
//            System.out.println("Location - " + c.getLoc());
//        }
        
        for(int i=0; i<loclist.size(); i++){
            crimelist = dbmngr.getCoordsFromLocID(loclist.get(i).getLocID());
            CrimeInfo x = crimelist.get(0);
            ComputingDistance compdist = new ComputingDistance();
//            System.out.println("Places in: " + loclist.get(i).getLocName());
            for(int j=1; j<crimelist.size(); j++){
//                System.out.println(j+1 + "th element:");
                System.out.println("x1 - " + x.getX());
                System.out.println("y1 - " + x.getY());
                System.out.println("x2 - " + crimelist.get(j).getX());
                System.out.println("y2 - " + crimelist.get(j).getY());
                System.out.println("Distance - " + compdist.getDistance(x, crimelist.get(j)));
            }
        }
        
    }

}
