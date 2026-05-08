package com.mycompany.ex3;

import entities.Animal;
import entities.GerenciadorAnimal;

/**
 *
 * @author 12303802644
 */



public class Ex3 {

    public static void main(String[] args) {
       GerenciadorAnimal gerenciadorAnimal = new GerenciadorAnimal();

        // Adicionando animais
        gerenciadorAnimal.adicionarAnimal(new Animal("Cachorro", "Golden Retriever", 3, 30));
        gerenciadorAnimal.adicionarAnimal(new Animal("Gato", "Siames", 2, 4));
        gerenciadorAnimal.adicionarAnimal(new Animal("Papagaio", "Ararauna", 5, 1));
        gerenciadorAnimal.adicionarAnimal(new Animal("Cavalo", "Puro-sangue inglês", 6, 500));

        // Salvando e carregando a lista de animais
        String caminhoDoArquivo = "animais.csv";
        gerenciadorAnimal.salvarNoArquivo(caminhoDoArquivo);
        gerenciadorAnimal.carregarDoArquivo(caminhoDoArquivo);

        // Imprimindo a lista carregada para verificar
        System.out.println(gerenciadorAnimal);
    }
}
