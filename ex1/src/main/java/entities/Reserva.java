package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Reserva {
    
    //Atributos
    private String nome;
    private int num_pessoas;
    private String data;
    private String hora;
    
    //Metodos
    
    public Reserva(){ // Construtor
        this.nome = "";
        this.num_pessoas = 0;
        this.data = "";
        this.hora = "";
    }
    
    public Reserva(Reserva outro){ //COnstrutor Copia
        this.nome = outro.getNome();
        this.num_pessoas = outro.getNumPessoas();
        this.data = outro.getData();
        this.hora = outro.getHora();
    }
    
    public void copia(Reserva outro){ //Copia
        this.nome = outro.getNome();
        this.num_pessoas = outro.getNumPessoas();
        this.data = outro.getData();
        this.hora = outro.getHora();
    }
    
    //Preeencher
    public void fill(Scanner leitor){
        
        System.out.println("Nome: ");
        this.nome = leitor.next();
        
        System.out.println("Numero de Pessoas: ");
        this.num_pessoas = leitor.nextInt();
         leitor.nextLine();//Limpar buffer
        
        System.out.println("Data(xx/xx/xxxx): ");
        this.data = leitor.next();
        
        System.out.println("Hora(xx:xx): ");
        this.hora = leitor.next();
    }
    
    //ToString
    @Override
    public String toString(){
        return ("Nome: " + this.nome
                + "Numero pessoas: " + this.num_pessoas
                + "Data: " + this.data
                + "Hora: " + this.hora);
    }
    
    //Imprimir
    public void Imprimir(){
        System.out.println("Nome: ");
        System.out.println(this.nome);
        System.out.println("Numero Pessoas: ");
        System.out.println(this.num_pessoas);
        System.out.println("Data: ");
        System.out.println(this.data);
        System.out.println("Hora: ");
        System.out.println(this.hora);
    }
    
    
    //Getters and Setters
    //-------------------------
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNumPessoas(int num_pessoas){
        this.num_pessoas = num_pessoas;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public void setHora(String hora){
        this.hora = hora;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getNumPessoas(){
        return this.num_pessoas;
    }
    
    public String getData(){
        return this.data;
    }
    
    public String getHora(){
        return this.hora;
    }
    //-------------

}