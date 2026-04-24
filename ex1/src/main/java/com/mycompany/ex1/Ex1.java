package com.mycompany.ex1;

/**
 *
 * @author kayna
 */
import java.util.Scanner;
import classes.Produto;
import classes.Roda;

public class Ex1 {

    public static void main(String[] args) {
        Roda r1,r2;
        Produto p1,p2;
        
        Scanner ler = new Scanner(System.in);
        
        r1 = new Roda();
        r2 = new Roda(r1);
        
        p1 = new Produto();
        p2 = new Produto();
        
        r1.fill(ler);
        System.out.println("");
        p1.fill(ler);
        
        System.out.println("");
        
        r1.imprimir(); 
        System.out.println("");
        p1.imprimir();
        
        r2 = new Roda(r1);
        System.out.println("");
        r2.imprimir();
    }
}
