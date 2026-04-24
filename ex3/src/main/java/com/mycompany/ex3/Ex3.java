package com.mycompany.ex3;

import java.util.Scanner;
import classes.Aluno;
/**
 *
 * @author kayna
 */
public class Ex3 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Aluno a1 = new Aluno();
        
        a1.fill(ler);
        a1.imprimir();
    }
}
