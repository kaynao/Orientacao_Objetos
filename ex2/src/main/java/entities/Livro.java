package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import java.util.List;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int paginas;
    private static String NomeDaBiblioteca;
    
    //metodos
    public Livro(){//Construtor
        this.titulo = "";
        this.autor = "";
        this.paginas = 0;
        NomeDaBiblioteca = "ABC";
    }
    
    public void fill(Scanner leitor){
        System.out.println("-----------");
        System.out.println("Titulo: ");
        this.titulo = leitor.next();
        System.out.println("Autor: ");
        this.autor = leitor.next();
        System.out.println("Paginas: ");
        this.paginas = leitor.nextInt();
        leitor.nextLine();
        System.out.println("-----------");
    }
    
    public String getNomeDaBiblioteca(){
        return NomeDaBiblioteca;
    }
}
