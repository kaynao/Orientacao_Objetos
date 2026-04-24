package com.mycompany.ex10;

import java.util.Scanner;
import classes.Casa;
/**
 *
 * @author kayna
 */

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Casa c1 = new Casa();
        
        c1.fill(ler);
        
        double result = c1.calcularPrecoM2();
        System.out.println(result);
        
    }
}
