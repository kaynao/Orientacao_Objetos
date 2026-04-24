package com.mycompany.ex1;

import java.util.Scanner;
import classes.TV;
/**
 *
 * @author kayna
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        TV tv1 = new TV();
        TV tv2 = new TV();
        
        System.out.println("TV1");
        tv1.fill(leitor);
        System.out.print(" ");
        System.out.println("TV2");
        tv2.fill(leitor);
       
        TV tv3 = new TV(tv1);
        
        tv2.setTamanho(80000);
        
        tv1.imprimir();
        tv2.imprimir();
        tv3.imprimir();
    }
}
