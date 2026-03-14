package com.mycompany.ex8;

import classes.Musica;
import java.util.Scanner;

/**
 *
 * @author kayna
 */
public class Ex8 {

    public static void main(String[] args) {
        
        Musica m1 = new Musica();
        Musica m2 = new Musica();
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Preencha a Musica: ");
        m1.fill(ler);
        
        System.out.println("");
        
        m2.copiar(m1);
         
        System.out.println("Abrindo dados da primeira musica na copia...");
        
        m2.imprimir();
        
        m2.ligarMusica();
        m2.desligarMusica();
    }
}
