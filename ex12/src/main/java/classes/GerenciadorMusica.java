/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classes.Musica;
/**
 *
 * @author kayna
 */
public class GerenciadorMusica {
    
    private List<Musica> musicas;
    
    public GerenciadorMusica() {
        this.musicas = new ArrayList<>();
    }
    
     public void Inserir(Scanner leitor) {
        Musica m = new Musica();
        m.fill(leitor);
        musicas.add(m);
        System.out.println("Música adicionada com sucesso!");
    }
     
    public void Remover(Scanner leitor) {
        System.out.print("Índice da música a remover: ");
        int indice = leitor.nextInt();
        leitor.nextLine();

        if (indice >= 0 && indice < musicas.size()) {
            musicas.remove(indice);
            System.out.println("Música removida com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    
      public void Pesquisar(Scanner leitor) {
        System.out.print("Título da música: ");
        String titulo = leitor.nextLine();

        boolean encontrou = false;
        for (Musica m : musicas) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                m.imprimir();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Música não encontrada!");
        }
    }
      
    public void Listar() {
        if (musicas.isEmpty()) {
            System.out.println("Nenhuma música cadastrada.");
            return;
        }
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println("Índice: " + i);
            musicas.get(i).imprimir();
            System.out.println("-----------");
        }
    }
    public void Interface() {
        System.out.println("--------------------------");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Adicionar Música");
        System.out.println("2 - Remover Música");
        System.out.println("3 - Pesquisar Música");
        System.out.println("4 - Listar Músicas");
        System.out.println("5 - Sair");
        System.out.println("--------------------------");
    }
    public void Select(Scanner leitor) {
        int opcao = 0;
        do {
            Interface();
            System.out.print("Opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1)      Inserir(leitor);
            else if (opcao == 2) Remover(leitor);
            else if (opcao == 3) Pesquisar(leitor);
            else if (opcao == 4) Listar();
            else if (opcao == 5) System.out.println("Fim!");
            else System.out.println("Opção inválida!");

        } while (opcao != 5);
    }
}
