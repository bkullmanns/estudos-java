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
public class Main {

    public static void main(String[] args) {
        System.out.println("Area circulo!");
        Circulo circulo = new Circulo(5);
        double area_circulo = circulo.area();
        System.out.println(area_circulo);     
        
        System.out.println("Area Retangulo!");
        Retangulo retangulo = new Retangulo();
        double area_retangulo = retangulo.area(8, 5);
        System.out.println(area_retangulo);     
        
        System.out.println("Area Quadrado!");
        Quadrado quadrado = new Quadrado();
        double area_quadrado = quadrado.area(5);
        System.out.println(area_quadrado); 
        
    }
}
