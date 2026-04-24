package classes;

import java.util.Scanner;

/**
 *
 * @author kayna
 */
public class Casa {
    //Atributos
    private String endereco;
    private double area;
    private int num_qrts;
    private double preco;
    
    //Metodos
    //COnstrutor
    public Casa(){
        this.endereco = "";
        this.area = 0.0;
        this.num_qrts = 0;
        this.preco = 0.0;
    }
    
    public void setEndereco(){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return this.endereco;
    }

    public double getArea() {
        return area;
    }

    public int getNum_qrts() {
        return num_qrts;
    }

    public double getPreco() {
        return preco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNum_qrts(int num_qrts) {
        this.num_qrts = num_qrts;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //Consturtor Copia
    public Casa(Casa outro){
        this.endereco = outro.getEndereco();
        this.area = outro.getArea();
        this.num_qrts = outro.getNum_qrts();
        this.preco = outro.getPreco();
    }
    
    public void imprimir(){
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Area: " + this.area);
        System.out.println("Numero de quartos: " + this.num_qrts);
        System.out.println("Preco: " + this.preco);
    }
    
    public void fill(Scanner leitor){
        System.out.print("Endereco: ");
        setEndereco(leitor.nextLine());
        System.out.print("Area: ");
        setArea(leitor.nextDouble());
        System.out.print("Numero de Qaurtos: ");
        setNum_qrts(leitor.nextInt());
        System.out.print("Preco: ");
        setPreco(leitor.nextDouble());
    }
    
    
}
