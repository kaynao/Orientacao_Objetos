package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author 12303802644
 */
public class Filme {

    private String titulo;
    private String diretor;
    private int duracao;
    private double preco;

    // construtor sem parâmetros
    public Filme() {
        titulo = "";
        diretor = "";
        duracao = 0;
        preco = 0.0;
    }

    // construtor com todos os parâmetros
    public Filme(String titulo, String diretor, int duracao, double preco) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.preco = preco;
    }

    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public double getPreco() {
        return preco;
    }

    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // preencher
    public void preencher(String titulo, String diretor, int duracao, double preco) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.preco = preco;
    }

    // imprimir
    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duracao: " + duracao);
        System.out.println("Preco: " + preco);
    }

    // copiar
    public Filme copiar() {
        Filme copia = new Filme();
        copia.titulo = this.titulo;
        copia.diretor = this.diretor;
        copia.duracao = this.duracao;
        copia.preco = this.preco;
        return copia;
    }
    
    public void preencher() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o titulo: ");
        this.titulo = leitor.nextLine();

        System.out.print("Informe o diretor: ");
        this.diretor = leitor.nextLine();

        System.out.print("Informe a duracao (minutos): ");
        this.duracao = leitor.nextInt();

        System.out.print("Informe o preco: ");
        this.preco = leitor.nextDouble();
    }
}