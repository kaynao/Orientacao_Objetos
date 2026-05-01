package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Funcionario {
    //Atributos
    private String nome;
    private String matricula;
    private double salario;
    private Endereco endereco;
    
    //Metodos
    public Funcionario(){
        this.nome = "";
        this.matricula = "";
        this.salario = 0.0;
        this.endereco = new Endereco();
    }
            
    public Funcionario(String nome, String matricula, double salario, Endereco endereco){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.endereco = new Endereco(endereco);
    }
    
    public Funcionario(Funcionario funcionario){
        this.nome = funcionario.getNome();
        this.matricula = funcionario.getMatricula();
        this.salario = funcionario.getSalario();
        this.endereco = new Endereco(funcionario.getEndereco());
    }
    
    public void copiar(Funcionario funcionario){
        this.nome = funcionario.getNome();
        this.matricula = funcionario.getMatricula();
        this.salario = funcionario.getSalario();
        this.endereco = new Endereco(funcionario.getEndereco());
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome 
                + " Matricula: " + this.matricula
                + " Salario: " + this.salario
                + " Endereco: " + this.endereco;
                
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
