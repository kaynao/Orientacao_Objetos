package classes;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Roda {
    private String marca;
    private float aro;
    private String material;
    private Scanner leitor;
    
    public Roda(){
        this.marca = "";
        this.aro = 0;
        this.material = "";
    }
    
    public Roda(Roda r){
        this.marca = r.getMarca();
        this.aro = r.getAro();
        this.material = r.getMaterial();
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setAro(float aro){
        this.aro = aro;
    }
    
    public float getAro(){
        return this.aro;
    }
    
    public void setMaterial(String material){
        this.material = material;
    }
    
    public String getMaterial(){
        return this.material;
    }
    
    public void fill(Scanner leitor){
        
        System.out.print("Marca: ");//printar na tela
        this.setMarca(leitor.nextLine()); //atualiza a marca baseado no que foi digitado
        
        System.out.print("Aro: ");
        this.setAro(leitor.nextFloat());
        
        leitor.nextLine();
        
        System.out.print("Material: ");
        this.setMaterial(leitor.nextLine());
    }
    
    public void imprimir(){
        System.out.println("Marca: "+ this.getMarca());
        System.out.println("Aro: "+ this.getAro());
        System.out.println("Material: "+ this.getMaterial());
    }
    
}
