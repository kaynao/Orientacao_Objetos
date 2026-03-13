package classes;

/**
 *
 * @author 12303802644
 */
import java.util.Scanner;

public class Musica {

    private String titulo;
    private String artista;
    private double duracao;
    private double preco;

    // construtor vazio
    public Musica() {
    }

    // construtor com parâmetros
    public Musica(String titulo, String artista, double duracao, double preco) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }

    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public double getPreco() {
        return preco;
    }

    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // preencher (fill)
    public void preencher() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o titulo:");
        titulo = leitor.nextLine();

        System.out.println("Informe o artista:");
        artista = leitor.nextLine();

        System.out.println("Informe a duracao:");
        duracao = leitor.nextDouble();

        System.out.println("Informe o preco:");
        preco = leitor.nextDouble();
    }

    // toString
    public String toString() {
        return "Titulo: " + titulo +
               "\nArtista: " + artista +
               "\nDuracao: " + duracao +
               "\nPreco: " + preco;
    }

    // copiar
    public Musica copiar() {

        Musica copia = new Musica();
        copia.setTitulo(this.titulo);
        copia.setArtista(this.artista);
        copia.setDuracao(this.duracao);
        copia.setPreco(this.preco);

        return copia;
    }

    // método mockado para tocar musica
    public void tocarMusica() {
        System.out.println("A musica " + this.titulo + " está tocando!");
    }

    // método mockado para desligar musica
    public void desligarMusica() {
        System.out.println("A musica " + this.titulo + " foi desligada!");
    }
}