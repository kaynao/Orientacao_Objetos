package entities;

/**
 *
 * @author 12303802644
 */

import java.util.Scanner;

public class Motorista {
    //Atributos
    private String nome;
    private Carro carro;
    
    //Metodos
    public Motorista(){//Construtor
        this.nome = "";
        this.carro = new Carro();
    }
    
    public Motorista(String nome, Carro carro){
        this.nome = nome;
        this.carro = carro;
    }
    
    public Motorista(Motorista motorista){
        this.nome = motorista.getNome();
        this.carro = motorista.getCarro();
    }
    
    //Getters and Setters 
    public String getNome(){
        return this.nome;
    }
    
    public Carro getCarro(){
        return this.carro;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome +
                " Carro: " + this.carro;
    }
    
    //preencher
    public void fill(Scanner leitor){
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("Carro: ");
        this.carro.fill(leitor);
    }
    
    public void copiar(Motorista motorista){
        this.nome = motorista.getNome();
        this.carro = motorista.getCarro();
    }
    
    public void dirigir(){
        carro.buzinar();
        carro.abrirPorta();
    }
}
