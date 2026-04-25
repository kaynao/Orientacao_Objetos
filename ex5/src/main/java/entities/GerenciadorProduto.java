package entities;

/**
 *
 * @author kayna
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorProduto {
    //Atributos
    private Map<String,Produto> estoque;
    
    //Metodos
    public GerenciadorProduto(){//Construtor
        this.estoque = new HashMap<>();
    }
    
    public void AdicionarProduto(Produto p){
        estoque.put(p.getCodigo(), p);
    }
    
    public void RemoverProduto(String codigo){
        if(estoque.remove(codigo) != null){
            System.out.println("Removido");
        }else{
            System.out.println("Não existe");
        }
    }
    
    public void AtualizarQuantidade(String codigo,int quantidade){
        Produto p = estoque.get(codigo);
        if(p != null){
            p.setQuantidadeEmEstoque(quantidade);
            System.out.println("Atualizado");
        }else{
            System.out.println("Não encontrado");
        }
    }
    
    public void ListarProduto(){
        if (estoque.isEmpty()){
            System.out.println("Ta vazio");
        }else{
            for(Produto p : estoque.values()){
                System.out.println(p);
            }
        }
    }
    
    public Produto buscarProduto(String codigo) {
        return estoque.get(codigo);
    }
    
}
