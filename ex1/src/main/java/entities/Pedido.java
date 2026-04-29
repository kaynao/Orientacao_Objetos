package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Pedido {
    //Atributos
    private String numero;
    private String data;
    private double quantidade;
    private Produto produto;
    
    //metodos
    
    public Pedido(){//Construtor
        this.numero = "";
        this.data = "";
        this.quantidade = 0;
        this.produto = new Produto();
    }
    
    public Pedido(String numero, String data, double quantidade, Produto produto){
        this.numero = numero;
        this.data = data;
        this.quantidade = quantidade;
        this.produto = new Produto(produto);
    }
    
    public Pedido(Pedido p){
        this.numero = p.getNumero();
        this.data = p.getData();
        this.quantidade = p.getQuantidade();
        this.produto = new Produto(p.getProduto());
    }
    
    public void copia(Pedido p){
        this.numero = p.getNumero();
        this.data = p.getData();
        this.quantidade = p.getQuantidade();
        this.produto = new Produto(p.getProduto());
    }
    
    public double calcularTotal(){
        return this.quantidade * this.produto.getPreco();
    }
    
    public void criarPedido(Scanner leitor){
        System.out.println("Numero: ");
        this.numero = leitor.next();
        System.out.println("Data(xx/xx/xxxx): ");
        this.data = leitor.next();
        System.out.println("Qunatidade: ");
        this.quantidade = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Produto");
        this.produto.fill(leitor);
    }
    
    
    public Produto getProduto(){
        return new Produto(this.produto);
    }
    
    public void setProduto(Produto produto){
        this.produto = new Produto(produto);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", data=" + data + ", quantidade=" + quantidade + ", produto=" + produto + '}';
    }
    
    
}
