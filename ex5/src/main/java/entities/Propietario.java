package entities;

/**
 *
 * @author kayna
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Propietario {
    //Atributos
    private String nome;
    private String cpf;
    private String email;
    private List<Carro> lstCarros;
    
    //Metodos
    
    public Propietario(){
        this.nome = "";
        this.cpf = "";
        this.email = "";
        this.lstCarros = new ArrayList<>();
    }
    
    public Propietario(String nome, String cpf, String email, List<Carro> lstCarros){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        
        this.lstCarros = new ArrayList<>();
        for(Carro c : lstCarros){
            this.lstCarros.add(new Carro(c));
        }
    }
    
    public Propietario(Propietario p){
        this.nome = p.getNome();
        this.cpf = p.getCpf();
        this.email = p.getEmail();
        
        this.lstCarros = new ArrayList<>();
        for(Carro c : p.getLstCarros()){
            this.lstCarros.add(new Carro(c));
        }
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome
                + "CPF: " + this.cpf 
                + "Email: " + this.email
                + "Lista Carros: " + this.lstCarros;            
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getLstCarros() {
        return lstCarros;
    }

    public void setLstCarros(List<Carro> lstCarros) {
        this.lstCarros = lstCarros;
    }
    
    
}
