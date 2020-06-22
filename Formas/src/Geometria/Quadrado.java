/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

/**
 *
 * @author bkullmann
 */
public class Quadrado {
    public double lado;
    public double area;
    public Quadrado(){
        
    }
    
    public double area(double lado){
        this.area = lado * lado;
        return area;
    }
}
