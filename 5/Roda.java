public class Roda {
    private double raio;
    private String material;
    private String cor;

    // Construtor completo
    public Roda(double raio, String material, String cor) {
        this.raio = raio;
        this.material = material;
        this.cor = cor;
    }

    // Construtor de cópia (abordagem delegação)
    public Roda(Roda outra) {
        this(outra.raio, outra.material, outra.cor);
    }

    // Getters e Setters
    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    // Copiar (delegação para construtor de cópia)
    public Roda copiar() {
        return new Roda(this);
    }

    @Override
    public String toString() {
        return String.format("Roda[raio=%.1f, material=%s, cor=%s]",
                raio, material, cor);
    }
}
