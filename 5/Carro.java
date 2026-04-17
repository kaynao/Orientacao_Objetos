import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private List<Roda> rodas;

    // Construtor completo
    public Carro(String fabricante, String modelo, String cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.rodas = new ArrayList<>();
    }

    // Construtor de cópia (abordagem delegação)
    public Carro(Carro outro) {
        this(outro.fabricante, outro.modelo, outro.cor);
        // Copia defensiva das rodas (agregação: copia os objetos)
        for (Roda r : outro.rodas) {
            this.rodas.add(r.copiar());
        }
    }

    // Getters e Setters
    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public List<Roda> getRodas() {
        // Retorna cópia defensiva da lista
        List<Roda> copia = new ArrayList<>();
        for (Roda r : rodas) {
            copia.add(r.copiar());
        }
        return copia;
    }

    // Adicionar roda (recebe cópia — delegação)
    public void adicionarRoda(Roda roda) {
        this.rodas.add(roda.copiar());
    }

    // Copiar (delegação para construtor de cópia)
    public Carro copiar() {
        return new Carro(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("  Carro[fabricante=%s, modelo=%s, cor=%s]%n",
                fabricante, modelo, cor));
        sb.append("    Rodas:%n".formatted());
        for (Roda r : rodas) {
            sb.append("      ").append(r).append("\n");
        }
        return sb.toString();
    }
}
