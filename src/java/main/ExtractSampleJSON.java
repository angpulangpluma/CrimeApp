/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.io.FileReader;
import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author Marienne Lopez
 */
public class ExtractSampleJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JSONParser parser = new JSONParser();
        
        try{
            Object obj = parser.parse(new FileReader("test.json"));
            
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);
            
            CrimeInfo ci = new CrimeInfo();
            ci.setX((double) jsonObject.get("x"));
            ci.setY((double) jsonObject.get("y"));
//            ci.setCrimeName((String) jsonObject.get("crimename"));
            ci.setLoc((String) jsonObject.get("loc"));
            
            System.out.println("Extracted info: ");
            System.out.println("X - " + ci.getX());
            System.out.println("Y - " + ci.getY());
//            System.out.println("Crime Name - " + ci.getCrimeName());
            System.out.println("Location - " + ci.getLoc());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
