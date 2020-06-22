package oo_emjava;

/* Pessoa física herda os atributos de cliente */
public class Fisica extends Cliente {
    public double altura;    

    public void imprimir(){
       /*  System.out.println("Nome: " + nome);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade.nome + "/" cidade.estado); */
        super.imprimir(); /* SUPER = faz herdar tudo da classe pai */
        System.out.println("Altura: " + altura);
    }

    public void imprimir(int id){
        super.imprimir(id);
        System.out.println("Altura: " + altura);
    }


    public double calcularIMC(double peso){
        double imc = peso / (altura*altura);
        return imc;
    }
}