package classes;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Produto {
    private float preco;
    private String nome;
    private int quantidade;
    
    public Produto(){
        preco = 0;
        nome = "";
        quantidade = 0;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
   public void fill(Scanner leitor){
       System.out.print("Preco: ");
       this.setPreco(leitor.nextFloat());
       
       leitor.nextLine();
       
       System.out.print("Nome: ");
       this.setNome(leitor.nextLine());
       
       System.out.print("Quantidade: ");
       this.setQuantidade(leitor.nextInt());
   }
   
   public void imprimir(){
        System.out.println("Preco: "+ this.getPreco());
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Quantidade: "+ this.getQuantidade());
    }
    
}
