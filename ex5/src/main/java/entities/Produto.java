package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Produto {
    //Atributos
    private String codigo;
    private String nome;
    private int quantidadeEmEstoque;
    
    
    //Metodos
    //Construtor
    public Produto(){ 
        this.codigo = "";
        this.nome = "";
        this.quantidadeEmEstoque = 0;
    }
    
    //Construtor Copia
    public Produto(Produto outro){
        this.nome = outro.getNome();
        this.codigo = outro.getCodigo();
        this.quantidadeEmEstoque = outro.getQuantidadeEmEstoque();
    }
    
    //Copiar
    public void copiar(Produto outro){
        this.nome = outro.getNome();
        this.codigo = outro.getCodigo();
        this.quantidadeEmEstoque = outro.getQuantidadeEmEstoque();
    }
    
    public void fill(Scanner leitor){
        System.out.println("Nome: ");
        this.nome = leitor.next();
        
        System.out.println("Codigo: ");
        this.codigo = leitor.next();
        
        System.out.println("Quantidade em Estoque: ");
        this.quantidadeEmEstoque = leitor.nextInt();
        leitor.nextLine();//limpezxa buffer
    }
    
    
    //getters and setters
    //-------------
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    //--------------
    
    //Imprimir
    public void Imprimir(){
        System.out.println("Nome: ");
        System.out.println(this.nome);
        System.out.println("Codigo: ");
        System.out.println(this.codigo);
        System.out.println("Quantidade em Estoque: ");
        System.out.println(this.quantidadeEmEstoque);
    }
    
    //toString
    @Override
    public String toString(){
        return "Nome: " + this.nome
                + "Codigo: " + this.codigo
                + "Quantidade em Estoque: " + this.quantidadeEmEstoque;
    }
    
}
 