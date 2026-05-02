package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Roda {
    
    //Atributos
    private double raio;
    private String material;
    private String cor;
    
    //Metodos
    public Roda(){//Construtor
        this.raio = 0.0;
        this.material = "";
        this.cor = "";
    }
    
    public Roda(double raio, String material, String cor){
        this.raio = raio;
        this.material = material;
        this.cor = cor;
    }
    
    public Roda(Roda r){
        this.raio = r.getRaio();
        this.material = r.getMaterial();
        this.cor = r.getCor();
    }
    
    public void copiar(Roda r){
        this.raio = r.getRaio();
        this.material = r.getMaterial();
        this.cor = r.getCor();
    }
    
    @Override
    public String toString(){
        return "Raio: " + this.raio
                + "Material: " + this.material
                + "Cor: " + this.cor;
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    //Getters and Setters
    public double getRaio(){
        return this.raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public String getMaterial(){
        return this.material;
    }
    
    public void setMaterial(String material){
        this.material = material;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
}
