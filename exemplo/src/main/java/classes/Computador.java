package classes;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Computador {
    private String nome;
    private int ssd;
    
    public Computador(){
        nome = "";
        ssd = 0;
    }
    
    public Computador(String nome, int ssd){
        this.nome = nome;
        this.ssd = ssd;
    }
    
    public int getSSD(){
        return this.ssd;
    }
    
    public void preencher(Scanner leitor){
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("SSD: ");
        this.ssd = leitor.nextInt();
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome
                + " SSD: " + ssd;
    }
}
