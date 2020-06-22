/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo_emjava;

/**
 *
 * @author bkullmann
 */
public class Cidade {
    public int id;
    public String nome, estado;

    public Cidade(){

    }
    
    public Cidade(int id){
        this.id = id;
    }

    public Cidade(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Cidade(String nome, String estado){
        
    }

    /* 
    métodos construtores que passam parametros obrigam a passar o parameto na instancia
    */

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Estado: " + this.estado);
    }

    public void imprimir(String usuario){
        System.out.println("Usuario: " + usuario);
        System.out.println("Nome: " + nome);
        System.out.println("Estado: " + this.estado);
    }
    
}
