package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Cliente {
    //Atributos
    private String nome;
    private String cpf;
    private ContaBancaria conta;
    
    //Metodos
    public Cliente(){//Construtor
        this.nome = "";
        this.cpf = "";
        this.conta = new ContaBancaria();
    }
    
    public Cliente(String nome, String cpf, ContaBancaria conta){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new ContaBancaria(conta);
    }
    
    public Cliente(Cliente c){
        this.nome = c.getNome();
        this.cpf = c.getCpf();
        this.conta = c.getConta();
    }
    
    public void copiar(Cliente c){
        this.nome = c.getNome();
        this.cpf = c.getCpf();
        this.conta = c.getConta();
    }
    
    public void preencheCliente(Scanner leitor){
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("CPF: ");
        this.cpf = leitor.next();
        System.out.println("Conta: ");
        this.conta.preencheConta(leitor);
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome +
                " CPF: " + this.cpf + 
                " Conta: " + this.conta;
    }
    
    public void imprimir(){
        System.out.println("Nome: ");
        System.out.println(this.nome);
        System.out.println("CPF: ");
        System.out.println(this.cpf);
        System.out.println("Conta: ");
        System.out.println(this.conta);
    }
    
    public void depositando(double deposito){
        this.conta.depositar(deposito);
    }
    
    public void sacando(double saque){
        this.conta.sacar(saque);
    }
    
    //Getters and Setters
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public ContaBancaria getConta(){
        return this.conta;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setConta(ContaBancaria conta){
        this.conta = conta;
    }
}
