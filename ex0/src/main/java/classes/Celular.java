package classes;

import java.util.Scanner;
/**
 *
 * @author kayna
 */
public class Celular {
    //atributos
    private String marca;
    private String modelo;
    private double preco;
    private int memoria;
    
    //metodos
    public Celular(){//Construtor
        this.marca = "";
        this.modelo = "";
        this.preco = 0.0;
        this.memoria = 0;
    }
    
    public Celular(Celular outro){
        this.marca = outro.getMarca();
        this.modelo = outro.getModelo();
        this.preco = outro.getPreco();
        this.memoria = outro.getMemoria();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public int getMemoria() {
        return memoria;
    }
    
    public void preencher(Scanner leitor){
        
        System.out.print("Marca: ");
        this.marca = leitor.nextLine();
        
        System.out.print("Modelo: ");
        this.modelo = leitor.nextLine();
        
        System.out.print("Preco: ");
        this.preco = leitor.nextDouble();
        
        System.out.print("Memoria: ");
        this.memoria = leitor.nextInt();
    }
    
    public void imprimir(){
        System.out.print(
        "Marca: " + getMarca() + " "
        + "Modelo: " + getModelo()+ " "
        + "Preco: " + getPreco() + " "
        + "Memoria: " + getMemoria());
    }
}
