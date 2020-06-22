/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.Produto;

/**
 *
 * @author bkullmann
 */
public class ProdutoDAO {
    public static void inserir(Produto produto){
        String sql = "INSERT INTO produtos (nome, preco) values ('" + produto.nome + "' , " + produto.preco + ")";
        Conexao.executar(sql);
    }

}
