/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.io.FileWriter;
import java.util.Random;
import org.json.simple.JSONObject;

/**
 *
 * @author Marienne Lopez
 */
public class CreateSampleJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random r = new Random();
        FileWriter file;
        double rangeMin = -100;
        double rangeMax = 100;
        JSONObject obj = new JSONObject();
        obj.put("x", rangeMin + (rangeMax - rangeMin) * r.nextDouble());
        obj.put("y", rangeMin + (rangeMax - rangeMin) * r.nextDouble());
        obj.put("crimename", "crime one");
        obj.put("loc", "philippines");
        
        try{
            file = new FileWriter("test.json");
            file.write(obj.toJSONString());
            System.out.println("Successfully copied JSON object to file.");
            System.out.println("\n JSON Object: " + obj);
            file.flush();
            file.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }

}
