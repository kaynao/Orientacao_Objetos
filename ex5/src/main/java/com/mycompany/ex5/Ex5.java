package com.mycompany.ex5;

import entities.GerenciadorCasa;
import entities.Casa;

/**
 *
 * @author 12303802644
 */
public class Ex5 {

    public static void main(String[] args) {
        GerenciadorCasa gerenciador = new GerenciadorCasa();

        gerenciador.adicionarCasa(new Casa("Apartamento", 2, 1, 65.0, 320000.0));
        gerenciador.adicionarCasa(new Casa("Casa",        3, 2, 120.0, 580000.0));
        gerenciador.adicionarCasa(new Casa("Cobertura",   4, 3, 200.0, 1200000.0));

        String caminho = "casas.json";
        gerenciador.salvarNoArquivo(caminho);
        gerenciador.carregarDoArquivo(caminho);

        System.out.println(gerenciador);
    }
}
