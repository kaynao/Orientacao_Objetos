package com.mycompany.ex0;

import java.util.Scanner;
import classes.Celular;
/**
 *
 * @author kayna
 */
public class Ex0 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Celular iphone = new Celular();
        iphone.preencher(ler);
        iphone.imprimir();
    }
}
