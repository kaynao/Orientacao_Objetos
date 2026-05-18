package classes;

public class Quarto {
    private int numero;
    private String tipo;
    private double preco;

    public Quarto(int numero, String tipo, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }
    
    public Quarto(){
        this.numero = 0;
        this.tipo = "";
        this.preco = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "Numero: " + numero + "   |   Tipo: " + tipo + "   |   Preco: " + preco + "\n";
    }
}
