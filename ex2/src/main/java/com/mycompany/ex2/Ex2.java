package com.mycompany.ex2;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import entities.Livro;
import entities.GerenciadorLivro;


public class Ex2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        GerenciadorLivro gl = new GerenciadorLivro();
        
        System.out.println("Quantos livros deseja instanciar? ");
        int n = leitor.nextInt();
        leitor.nextLine();

        gl.AdicionarLivro(n, leitor);
        gl.ImprimirNomeDaBiblioteca();
    }
}