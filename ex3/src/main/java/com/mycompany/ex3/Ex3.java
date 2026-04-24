package com.mycompany.ex3;


import java.util.Scanner;

/**
 *
 * @author kayna
 */
public class Ex3 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String aluno1,aluno2;
        
        System.out.print("Insira o nome do primeiro aluno: ");
        aluno1 = leitor.nextLine();
        
        System.out.println("");
        
        System.out.print("Insira o nome do segundo aluno: ");
        aluno2 = leitor.nextLine();
        
        if(aluno1.equalsIgnoreCase(aluno2)){
            System.out.println("Eles tem o mesmo nome.");
        }
        else{
            if(aluno1.length() > aluno2.length()){
                System.out.println(aluno1);
            }
            else{
                System.out.println(aluno2);
            }
        }        
    }
}
