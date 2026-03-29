
package com.mycompany.mavenproject2;


import classes.Livro;
import java.util.Scanner;

/**
 *
 * @author kayna
 */
public class Ex2 {
    public static void main(String[] args) {

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro l2 = new Livro("1984", "George Orwell", 328);
        Livro l3 = new Livro("O Hobbit", "Tolkien", 310);

        System.out.println("=== Valor inicial ===");
        l1.mostrar();
        l2.mostrar();
        l3.mostrar();

        // Alterando pela classe (forma correta)
        Livro.setNomeDaBiblioteca("Biblioteca Municipal");

        System.out.println("\n=== Após alterar pela classe ===");
        l1.mostrar();
        l2.mostrar();
        l3.mostrar();

        // Alterando novamente
        Livro.setNomeDaBiblioteca("Biblioteca Escolar");

        System.out.println("\n=== Após nova alteração ===");
        l1.mostrar();
        l2.mostrar();
        l3.mostrar();
    }
}
