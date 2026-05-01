package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Endereco {
    //Atributos
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    
    //Metodos
    public Endereco(){//Construtor
        this.rua = "";
        this.numero = 0;
        this.bairro = "";
        this.cidade = "";
    }
    
    public Endereco(String rua, int numero, String bairro, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    
    public Endereco(Endereco endereco){
        this.rua = endereco.getRua();
        this.numero = endereco.getNumero();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
    }
    
    public void copiar(Endereco endereco){
        this.rua = endereco.getRua();
        this.numero = endereco.getNumero();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
    }
   
    @Override
    public String toString(){
        return "Rua: " + this.rua +
                " Numero: " + this.numero + 
                " Bairro: " + this.bairro +
                " Cidade: " + this.cidade;
    }
    
    public void imprimir(){
        System.out.println("Rua: ");
        System.out.println(this.rua);
        System.out.println("Numero: ");
        System.out.println(this.numero);
        System.out.println("Bairro: ");
        System.out.println(this.bairro);
        System.out.println("Cidade: ");
        System.out.println(this.cidade);
    }
    
    //getters and setters
    public String getRua(){
        return this.rua;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
}
