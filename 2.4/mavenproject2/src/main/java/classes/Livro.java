
package classes;

/**
 *
 * @author kayna
 */
public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    // atributo estático
    private static String nomeDaBiblioteca = "Biblioteca Central";

    // Construtor
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public static String getNomeDaBiblioteca() {
        return nomeDaBiblioteca;
    }

    // SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public static void setNomeDaBiblioteca(String nome) {
        nomeDaBiblioteca = nome;
    }

    // Método para exibir
    public void mostrar() {
        System.out.println("Título: " + titulo +
                " | Autor: " + autor +
                " | Páginas: " + paginas +
                " | Biblioteca: " + nomeDaBiblioteca);
    }
}