package oo_emjava;

public class Cliente {
    private int id;
    public String nome;
    protected String bairro;
    public Cidade cidade; /* cidade é um objeto */

    public Cliente(){

    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade.nome + "/" + this.cidade.estado);

    }

    public void imprimir(int id){
        System.out.println("Nome: " + this.nome);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade.nome + "/" + this.cidade.estado);

    }

    /* retorna uma string */
    public String buscarNome(){
        return nome;
    }

    public String buscarNomeCompleto(String sobrenome){
        return nome + sobrenome;
    }


}