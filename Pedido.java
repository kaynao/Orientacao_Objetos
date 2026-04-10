public class Pedido {

    private int numero;
    private String data;
    private double quantidade;
    private Produto produto;

    // Construtor padrão
    public Pedido() {}

    // Construtor com parâmetros
    public Pedido(int numero, String data, double quantidade, Produto produto) {
        this.numero = numero;
        this.data = data;
        this.quantidade = quantidade;
        this.produto = produto.copiar(); // cópia defensiva
    }

    // Construtor de cópia
    public Pedido(Pedido outro) {
        this.numero = outro.numero;
        this.data = outro.data;
        this.quantidade = outro.quantidade;
        this.produto = outro.produto.copiar();
    }

    // Getters e Setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public double getQuantidade() { return quantidade; }
    public void setQuantidade(double quantidade) { this.quantidade = quantidade; }

    public Produto getProduto() { return produto.copiar(); }
    public void setProduto(Produto produto) { this.produto = produto.copiar(); }

    // Delegação: Pedido pergunta ao Produto qual é o preço unitário
    public double calcularTotal() {
        return produto.getPrecoUnitario() * quantidade;
    }

    // Método copiar: retorna uma cópia deste pedido
    public Pedido copiar() {
        return new Pedido(this);
    }

    @Override
    public String toString() {
        return "Pedido{" +
               "numero=" + numero +
               ", data='" + data + "'" +
               ", quantidade=" + quantidade +
               ", produto=" + produto +
               "}";
    }
}
