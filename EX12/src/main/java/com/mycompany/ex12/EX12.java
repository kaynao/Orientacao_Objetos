package com.mycompany.ex12;

/**
 *
 * @author 12303802644
 */
import classes.Musica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX12 {

    public static int imprimeMenu(Scanner leitor) {

        System.out.println("----------------------------");
        System.out.println("1 - Inserir musica");
        System.out.println("2 - Remover musica");
        System.out.println("3 - Pesquisar musica");
        System.out.println("4 - Tocar musica");
        System.out.println("5 - Desligar musica");
        System.out.println("0 - Sair");
        System.out.println("----------------------------");
        System.out.println("Escolha uma opcao:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {

        List<Musica> listaMusicas = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        int opcao;

        do {

            opcao = imprimeMenu(leitor);
            leitor.nextLine(); // limpar buffer

            if (opcao == 1) { // inserir

                Musica m = new Musica();
                m.preencher();
                listaMusicas.add(m);

            } else if (opcao == 2) { // remover

                System.out.println("Informe o titulo:");
                String titulo = leitor.nextLine();

                for (int i = 0; i < listaMusicas.size(); i++) {

                    Musica mi = listaMusicas.get(i);

                    if (titulo.equals(mi.getTitulo())) {
                        System.out.println("Musica removida");
                        listaMusicas.remove(i);
                        break;
                    }
                }

            } else if (opcao == 3) { // pesquisar

                System.out.println("Informe o titulo:");
                String titulo = leitor.nextLine();

                for (int i = 0; i < listaMusicas.size(); i++) {

                    Musica mi = listaMusicas.get(i);

                    if (titulo.equals(mi.getTitulo())) {
                        System.out.println("Musica encontrada:");
                        System.out.println(mi.toString());
                    }
                }

            } else if (opcao == 4) { // tocar

                System.out.println("Informe o titulo:");
                String titulo = leitor.nextLine();

                for (int i = 0; i < listaMusicas.size(); i++) {

                    Musica mi = listaMusicas.get(i);

                    if (titulo.equals(mi.getTitulo())) {
                        mi.tocarMusica();
                    }
                }

            } else if (opcao == 5) { // desligar

                System.out.println("Informe o titulo:");
                String titulo = leitor.nextLine();

                for (int i = 0; i < listaMusicas.size(); i++) {

                    Musica mi = listaMusicas.get(i);

                    if (titulo.equals(mi.getTitulo())) {
                        mi.desligarMusica();
                    }
                }

            }

        } while (opcao != 0);

        leitor.close();
    }
}