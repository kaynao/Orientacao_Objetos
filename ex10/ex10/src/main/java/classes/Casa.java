
package classes;


import java.util.Scanner;
/**
 *
 * @author kayna
 */
public class Casa {
    //atributos
    private String endereco;
    private double area;
    private int num_quartos;
    private double preco;
    
    //metodos
    public Casa(){//Constrtutor
        endereco = "";
        area = 0.0;
        num_quartos = 0;
        preco = 0.0;
    }
    
    public Casa(Casa outro){// Construtor copia
        endereco = outro.getEndereco();
        area  = outro.getArea();
        num_quartos = outro.getNum_Quartos();
        preco = outro.getPreco();
    }
    
    //getters e setters 
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public double getArea(){
        return this.area;
    }
    
    public void setNum_Quartos(int num_quartos){
        this.num_quartos = num_quartos;
    }
    
    public int getNum_Quartos(){
        return this.num_quartos;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void imprimir(){
        System.out.print(this.endereco);
        System.out.println(this.area);
        System.out.println(this.num_quartos);
        System.out.println(this.preco);
    }
    
    public void fill(Scanner leitor){
        
        System.out.print("Endereco: ");
        setEndereco(leitor.nextLine());
        
        System.out.println(" ");
        
        System.out.print("Area: ");
        setArea(leitor.nextDouble());
        
        System.out.println();
        
        System.out.print("Numero de Quartos: ");
        setNum_Quartos(leitor.nextInt());
        
        System.out.println();
        
        System.out.println("Preco: ");
        setPreco(leitor.nextDouble());
    }
    
    public double calcularPrecoM2(){
        double resultado = 0.0;
        
        resultado = getPreco()/getArea();
        
        return resultado;
    }
    
    public void exibirResumo(){
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Área: " + this.area + " m²");
        System.out.println("Quartos: " + this.num_quartos);
        System.out.println("Preço: R$ " + this.preco);
    }
    
}
