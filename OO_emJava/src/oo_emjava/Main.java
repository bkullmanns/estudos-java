
import oo_emjava.Cidade;
import oo_emjava.Cliente;
import oo_emjava.Fisica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bkullmann
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        Cidade c1 = new Cidade();
        c1.nome = "Porto Alegre";
        c1.estado = "RS";
        c1.imprimir();
        c1.imprimir("Joao");

        Cliente cliente = new Cliente();
        cliente.nome = "Julia";
        cliente.bairro = "Centro";
        cliente.cidade = c1;
/*         cliente.cidade = new Cidade("Capão da Canoa", "RS");
 */     cliente.imprimir();
        Fisica cliFisica = new Fisica();
        cliFisica.nome = "Suzy";
        cliFisica.bairro = "Petrópolis";
        cliFisica.cidade = c1;
        cliFisica.altura = 1.72;
        cliFisica.imprimir();

        String nome = cliFisica.buscarNome();
        String nomeCompleto = cliFisica.buscarNomeCompleto(" Silva");
        Double imc = cliFisica.calcularIMC(80.9);
        System.out.println(nomeCompleto + " imc: " + imc);
        

    }
    
}
