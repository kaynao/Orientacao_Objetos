package entities;

/**
 *
 * @author 12303802644
 */
public class Animal {
    private String especie;
    private String raca;
    private int idade;
    private double peso;

    public Animal(String especie, String raca, int idade, double peso) {
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }
    
    public Animal(){
        this.especie = "";
        this.raca = "";
        this.idade = 0;
        this.peso = 0.0;
    }
    
    public Animal(Animal outro){
        this.especie = outro.getEspecie();
        this.raca = outro.getRaca();
        this.idade = outro.getIdade();
        this.peso = outro.getPeso();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
