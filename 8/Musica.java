public class Musica {
    private String titulo;
    private double duracao;

    // Construtor completo
    public Musica(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    // Construtor de cópia (delegação)
    public Musica(Musica outra) {
        this(outra.titulo, outra.duracao);
    }

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public double getDuracao() { return duracao; }
    public void setDuracao(double duracao) { this.duracao = duracao; }

    // Copiar (delegação)
    public Musica copiar() {
        return new Musica(this);
    }

    @Override
    public String toString() {
        return String.format("Musica[titulo=%s, duracao=%.2f min]", titulo, duracao);
    }
}
