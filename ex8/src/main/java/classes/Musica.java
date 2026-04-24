package classes;

import java.util.Scanner;

/**
 *
 * @author kayna
 */
public class Musica {
    
    //atributos
    private String titulo;
    private String artista;
    private double duracao;
    private double preco;
    
    
    //metodos
    public Musica(){//Construtor
        this.titulo = "";
        this.artista = "";
        this.duracao = 0.0;
        this.preco = 0.0;
    }
    
    //getters e setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public String getArtista(){
        return this.artista;
    }
    
    public void setDuracao(double duracao){
        this.duracao = duracao;
    }
    
    public double getDuracao(){
        return this.duracao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void imprimir(){ //Imprimir
        System.out.print("======================");
        System.out.print("Título [ " + this.titulo + " ]");
        System.out.print("Artista [ " + this.artista + " ]");
        System.out.print("Duracao [ " + this.duracao + " ]");
        System.out.print("Artista [ " + this.preco + " ]");
        System.out.print("======================");
    }
    
    public void fill(Scanner leitor){
        System.out.print("Titulo: ");
        setTitulo(leitor.nextLine());
        System.out.print("Artista: ");
        setArtista(leitor.nextLine());
        System.out.print("Duracao: ");
        setDuracao(leitor.nextDouble());
        System.out.print("Preco: ");
        setPreco(leitor.nextDouble());
        leitor.nextLine(); 
    }
    
     public void copiar(Musica outro){//copiar
        this.titulo = outro.getTitulo();
        this.artista = outro.getArtista();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();
    }
     
     public void ligarMusica(){
         System.out.println("A musica " + this.titulo + " esta tocando");
     }
     
     public void desligarMusica(){
         System.out.println("A musica " + this.titulo + " parou de tocar");
     }
}
