package com.mycompany.ex2;

import java.util.Scanner;
/**
 *
 * @author kayna
 */
public class Ex2 {

    public static void main(String[] args) {
        
        int num = 0;//declarando o n digitado
        int soma = 0;//declarando a soma
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe um numero: ");
        num = leitor.nextInt();
        
        for (int i = 0; i <= num; i++){
            if(i % 2 == 1){//se o numero for impar ele realiza a soma
                soma = soma + i;
            }
        }
        
        System.out.println("Soma eh igual: " + soma);
    }
}
