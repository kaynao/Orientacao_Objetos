/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class Filme {
    
    //atributos
    private String titulo;
    private String autor;
    private int duracao;
    
    //metodos
    
    public Filme (){ //COnstrutor
        titulo = "";
        autor = "";
        duracao = 0;
    }
    
    public Filme (Filme outro){ //Construtor Copia
        this.titulo = outro.titulo;
        this.autor = outro.autor;
        this.duracao = outro.duracao;
    }
    
    
    
    // Getters e Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    
    //Fill
    public void fill(Scanner leitor){
        System.out.println("Titulo: ");
        this.titulo = leitor.next();
        leitor.nextLine();
        System.out.println("Autor: ");
        this.autor = leitor.nextLine();
        System.out.println("Duracao: ");
        this.duracao = leitor.nextInt();
    }
    
    public Filme copiar() {
        return new Filme(this); // delega ao construtor de cópia
    }
    
    //ToString
    @Override
    public String toString(){
        return "Titulo: " + this.titulo
                +"\nAutor: " + this.autor 
                + "\nDuracao: " + this.duracao;
    }
    
    //Equals
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        
        Filme outro = (Filme) obj;
        return duracao == outro.duracao 
                        && titulo.equals(outro.titulo) 
                        && autor.equals(outro.autor);
    }
}
