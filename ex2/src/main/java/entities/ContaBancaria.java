package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class ContaBancaria {
    //Atributos
    private int numero;
    private String tipo;
    private double saldo;
    
    //metodos
    public ContaBancaria(){//Construtor
        this.numero = 0;
        this.tipo = "";
        this.saldo = 0.0;
    }
    
    public ContaBancaria(int numero, String tipo, double saldo){
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    
    public ContaBancaria(ContaBancaria conta){
        this.numero = conta.getNumero();
        this.tipo = conta.getTipo();
        this.saldo = conta.getSaldo();
    }
    
    public void Copiar(ContaBancaria conta){
        this.numero = conta.getNumero();
        this.tipo = conta.getTipo();
        this.saldo = conta.getSaldo();
    }
    
    public void preencheConta(Scanner leitor){
        System.out.println("Numero: ");
        this.numero = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Tipo: ");
        this.tipo = leitor.next();
        System.out.println("Saldo: ");
        this.saldo = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Numero: ");
        System.out.println(this.numero);
        System.out.println("Tipo: ");
        System.out.println(this.tipo);
        System.out.println("Saldo: ");
        System.out.println(this.saldo);
    }
    
    public void depositar(double deposito){
        this.saldo = saldo + deposito;
    }
    
    public void sacar(double saque){
        if(saque > this.saldo){
            System.out.println("Valor invalido");
        }else{
        this.saldo = saldo - saque;
        }
    }
    
    @Override
    public String toString(){
        return "Numero: " + this.numero +
                " Tipo: " + this.tipo + 
                " Saldo: " + this.saldo;
    }
    
    //getters and setters
    public int getNumero(){
        return this.numero;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
