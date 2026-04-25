package com.mycompany.exemplo;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import classes.Computador;

/**
 *
 * @author kayna
 */
public class Exemplo {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Computador c = new Computador();
        
        List<Computador> computadores = new ArrayList();
        
        c.preencher(ler);
        computadores.add(c);
        
        if(!computadores.isEmpty()){
            Computador MaiorSSD = computadores.get(0);
            for(int i = 1; i < computadores.size();i++){
                if(computadores.get(i).getSSD() > MaiorSSD.getSSD()){
                    MaiorSSD = computadores.get(i);
                }
            }
            System.out.println("\nComputador com maior SSD:");
            System.out.println(MaiorSSD);
        }else{
            System.out.println("Não tem elementos na lista");
        }
    }
}
