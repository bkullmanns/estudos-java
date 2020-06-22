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

public class Circulo extends FormaGeometrica {
    public double raio;
    public double pi = 3.1416;
    public double area;    

    public Circulo(double raio) {
        this.raio = raio;
    }  

    public Circulo(){
        
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double area(){
        this.area = this.pi * (Math.pow(this.raio, 2));
        return this.area;

    }  
   
}
