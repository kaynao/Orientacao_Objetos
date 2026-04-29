package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Produto {
    //Atributos
    private String nome;
    private String categoria;
    private double preco;
    
    //Metodos
    
    public Produto(){
        this.nome = "";
        this.categoria = "";
        this.preco = 0.0;
    }
    
    public Produto(String nome, String categoria, double preco) { //Construtor
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    
    public Produto(Produto p) { //Construtor Copia
        this.nome = p.getNome();
        this.categoria = p.getCategoria();
        this.preco = p.getPreco();
    }
    
    public void fill(Scanner leitor){
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("Categoria: ");
        this.categoria = leitor.next();
        System.out.println("Preco: ");
        this.preco = leitor.nextDouble();
    }
    
    public void copia(Produto p){
        this.nome = p.getNome();
        this.categoria = p.getCategoria();
        this.preco = p.getPreco();
    }
    
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + 
                ", categoria=" + categoria + 
                ", preco=" + preco + '}';
    }
    
    
   
}
