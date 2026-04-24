package com.mycompany.ex1;

import java.util.Scanner;
/**
 *
 * @author kayna
 */
public class Ex1 {

    public static void main(String[] args) {
        int n1, n2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o primeiro valor: ");
        n1 = ler.nextInt();
        
        System.out.print("Insira o segundo valor: ");
        n2 = ler.nextInt();
        
        if (n1 > n2){
            System.out.println("O primeiro valor é maior ou igual ao segundo.");
        }else{
            System.out.println("O segundo valor é maior ou igual ao primeiro");
        }
    }
}
