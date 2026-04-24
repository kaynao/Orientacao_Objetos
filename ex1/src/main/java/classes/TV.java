package classes;


import java.util.Scanner;
/**
 *
 * @author kayna
 */
public class TV {
    //atributos
    private String marca;
    private int tamanho;
    private String resolucao;
    private double preco;
    
    //metodos
    public TV(){//Construtor
        this.marca = "";
        this.tamanho = 0;
        this.resolucao = "";
        this.preco = 0.0;
    }
    
    public TV(TV outro){//ConstrutorCopia
        this.marca = outro.getMarca();
        this.tamanho = outro.getTamanho();
        this.resolucao = outro.getResolucao();
        this.preco = outro.getPreco();
    }
    
    //getters e setters
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    
    public void setResolucao(String resolucao){
        this.resolucao = resolucao;
    }
    
    public String getResolucao(){
        return this.resolucao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    //preencher
    public void fill(Scanner leitor){
        System.out.print("Marca: ");
        setMarca(leitor.nextLine());

        System.out.print("Tamanho: ");
        setTamanho(leitor.nextInt());
        leitor.nextLine(); // Limpa o "Enter" que sobrou do Tamanho

        System.out.print("Resolucao: ");
        setResolucao(leitor.nextLine()); // Agora ele vai esperar você digitar

        System.out.print("Preco: ");
        setPreco(leitor.nextDouble());
        leitor.nextLine(); // Limpa o "Enter" que sobrou do Preço    
    }
    
    public void imprimir(){
        System.out.print("Marca: " + this.marca);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Resolucao: " + this.resolucao);
        System.out.println("Preco: " + this.preco);        
    }
}
