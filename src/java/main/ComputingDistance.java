/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Marienne Lopez
 */
public class ComputingDistance {
    
    public double getDistance(CrimeInfo a, CrimeInfo b){      
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        return sqrt(pow((x2-x1), 2) + pow((y2-y1), 2));
    }

}
