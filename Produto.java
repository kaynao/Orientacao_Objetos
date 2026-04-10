public class Produto {

    private String nome;
    private String categoria;
    private double precoUnitario;

    // Construtor padrão
    public Produto() {}

    // Construtor com parâmetros
    public Produto(String nome, String categoria, double precoUnitario) {
        this.nome = nome;
        this.categoria = categoria;
        this.precoUnitario = precoUnitario;
    }

    // Construtor de cópia
    public Produto(Produto outro) {
        this.nome = outro.nome;
        this.categoria = outro.categoria;
        this.precoUnitario = outro.precoUnitario;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }

    // Método copiar: retorna uma cópia deste produto
    public Produto copiar() {
        return new Produto(this);
    }

    @Override
    public String toString() {
        return "Produto{" +
               "nome='" + nome + "'" +
               ", categoria='" + categoria + "'" +
               ", precoUnitario=R$" + String.format("%.2f", precoUnitario) +
               "}";
    }
}
