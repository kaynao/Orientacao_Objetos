package entities;

/**
 *
 * @author kayna
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Carro {
    //Atributos
    private String fabricante;
    private String modelo;
    private String cor;
    private List<Roda> lstRodas;
    
    //Metodos
    public Carro(){//Construtor
        this.fabricante  = "";
        this.modelo  = "";
        this.cor  = "";
        this.lstRodas = new ArrayList<>();
    }
    
    public Carro(String fabricante,String modelo,String cor){//Construtor
        this.fabricante  = fabricante;
        this.modelo  = modelo;
        this.cor  = cor;
        this.lstRodas = new ArrayList<>();
    }
    
    public Carro(Carro c){
        this.fabricante = c.getFabricante();
        this.modelo = c.getModelo();
        this.cor = c.getCor();
        
        this.lstRodas = new ArrayList<Roda>();
        for(Roda r : c.getLstRodas()){
            this.lstRodas.add(new Roda(r));
        }
    }
    
    public void copiar(Carro c){
        this.fabricante = c.getFabricante();
        this.modelo = c.getModelo();
        this.cor = c.getCor();
        
        this.lstRodas = new ArrayList<Roda>();
        for(Roda r : c.getLstRodas()){
            this.lstRodas.add(new Roda(r));
        }
    }
    
    @Override
    public String toString(){
        return "Fabricante: " + this.fabricante
                + "Modelo: " + this.modelo
                + "Cor: " + this.cor
                + "Lista Rodas: " + this.lstRodas;
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    //Getters and Setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Roda> getLstRodas() {
        return lstRodas;
    }

    public void setLstRodas(List<Roda> lstRodas) {
        this.lstRodas = lstRodas;
    }
    
    
}
