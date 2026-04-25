package com.mycompany.ex13;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import classes.Filme;
import classes.GerenciadorFilme;
import java.util.ArrayList;

public class Ex13 {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       GerenciadorFilme gerenciador = new GerenciadorFilme();
       int opcao;
       
        do {
            System.out.println("\n===== CADASTRO DE FILMES =====");
            System.out.println("1 - Adicionar filme");
            System.out.println("2 - Remover filme");
            System.out.println("3 - Pesquisar por titulo");
            System.out.println("4 - Pesquisar por autor");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // limpa o buffer

            switch (opcao) {

                case 1: // Adicionar
                    Filme novo = new Filme();
                    novo.fill(leitor);
                    gerenciador.addFilme(novo);
                    System.out.println("Filme adicionado com sucesso!");
                    break;

                case 2: // Remover
                    System.out.print("Digite o titulo do filme a remover: ");
                    String tituloRemover = leitor.nextLine();

                    if (gerenciador.removeFilme(tituloRemover))
                        System.out.println("Filme removido com sucesso!");
                    else
                        System.out.println("Filme nao encontrado.");
                    break;

                case 3: // Pesquisar por titulo
                    System.out.print("Digite o titulo: ");
                    String tituloBusca = leitor.nextLine();

                    Filme encontrado = gerenciador.buscarPorTitulo(tituloBusca);
                    if (encontrado != null)
                        System.out.println(encontrado);
                    else
                        System.out.println("Filme nao encontrado.");
                    break;

                case 4: // Pesquisar por autor
                    System.out.print("Digite o autor: ");
                    String autorBusca = leitor.nextLine();

                    ArrayList<Filme> filmes = gerenciador.buscarPorAutor(autorBusca);
                    if (filmes.isEmpty())
                        System.out.println("Nenhum filme encontrado.");
                    else
                        for (Filme f : filmes)
                            System.out.println(f);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);
    }
}
