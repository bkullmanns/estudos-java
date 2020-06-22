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
public class Retangulo extends FormaGeometrica {
    public double altura;
    public double largura;
    public double area;

    public Retangulo(){

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double area(double altura, double largura){
         this.area = altura * largura;
         return area;
    }
    
}
