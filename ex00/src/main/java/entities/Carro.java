package entities;

/**
 *
 * @author 12303802644
 */

import java.util.Scanner;

public class Carro {
    //Atributos
    private String modelo;
    private int ano;
    private String cor; 
    
    //Metodos 
    public Carro(){//Construtor
        this.modelo = "";
        this.ano = 0;
        this.cor = "";
    }
    
    public Carro(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    
    public Carro(Carro c){
        this.modelo = c.getModelo();
        this.ano = c.getAno();
        this.cor = c.getCor();
    }
    
    //Copiar
    public void copiar(Carro c){
        this.modelo = c.getModelo();
        this.ano = c.getAno();
        this.cor = c.getCor();
    }
    
    //ToString
    @Override 
    public String toString(){
        return "Modelo: " + this.modelo +
               " Ano: " + this.ano + 
               " Cor: " + this.cor;
    }
    
    //Iprimir
    public void imprimir(){
        System.out.println("Modelo: ");
        System.out.println(this.modelo);
        System.out.println("Ano: "); 
        System.out.println(this.ano);
        System.out.println("Cor: ");
        System.out.println(this.cor);
    }
    
    //preencher
    public void fill(Scanner leitor){
        System.out.println("Modelo: ");
        this.modelo = leitor.next();
        System.out.println("Ano: ");
        this.ano = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Cor:");
        this.cor = leitor.next();
    }
    
    //Getters and Setters
    public String getModelo(){
        return this.modelo;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    //Buzinart
    public void buzinar(){
        System.out.println("Bi bi bi");
    }
    
    public void abrirPorta(){
        System.out.println("Porta aberta!!!");
    }
}
