package com.mycompany.ex12;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import classes.Musica;
import java.util.ArrayList;
import java.util.List;
import classes.GerenciadorMusica;
        
public class Ex12 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(java.util.Locale.forLanguageTag("pt-BR"));
        
        GerenciadorMusica g = new GerenciadorMusica();
        g.Select(leitor);
    }
}
