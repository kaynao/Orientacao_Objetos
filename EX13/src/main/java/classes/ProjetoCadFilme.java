
package classes;
/**
 *
 * @author 12303802644
 */
import classes.Filme;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjetoCadFilme {

    // menu
    public static int imprimeMenu(Scanner leitor) {
        System.out.println("------------------------------");
        System.out.println("1 - Inserir filme");
        System.out.println("2 - Remover filme");
        System.out.println("3 - Pesquisar filme (titulo)");
        System.out.println("4 - Pesquisar filme (diretor)");
        System.out.println("5 - Listar filmes");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.print("Escolha uma opcao: ");
        return leitor.nextInt();
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Filme> listaFilmes = new ArrayList<>();

        int opcao;

        do {
            opcao = imprimeMenu(leitor);
            leitor.nextLine(); // limpar buffer do teclado

            if (opcao == 1) { // Inserir filme
                Filme f = new Filme();
                f.preencher();
                listaFilmes.add(f);
                System.out.println("Filme adicionado!\n");

            } else if (opcao == 2) { // Remover filme
                System.out.print("Informe o titulo do filme a remover: ");
                String titulo = leitor.nextLine();
                boolean removido = false;

                for (int i = 0; i < listaFilmes.size(); i++) {
                    if (listaFilmes.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                        listaFilmes.remove(i);
                        removido = true;
                        System.out.println("Filme removido!\n");
                        break; // evita erro ao remover durante o loop
                    }
                }

                if (!removido) {
                    System.out.println("Filme nao encontrado.\n");
                }

            } else if (opcao == 3) { // Pesquisar por título
                System.out.print("Informe o titulo do filme: ");
                String titulo = leitor.nextLine();
                boolean encontrado = false;

                for (Filme f : listaFilmes) {
                    if (f.getTitulo().equalsIgnoreCase(titulo)) {
                        System.out.println("Filme encontrado:");
                        f.imprimir();
                        System.out.println();
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Filme nao encontrado.\n");
                }

            } else if (opcao == 4) { // Pesquisar por diretor
                System.out.print("Informe o diretor do filme: ");
                String diretor = leitor.nextLine();
                boolean encontrado = false;

                for (Filme f : listaFilmes) {
                    if (f.getDiretor().equalsIgnoreCase(diretor)) {
                        System.out.println("Filme encontrado:");
                        f.imprimir();
                        System.out.println();
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Nenhum filme encontrado para esse diretor.\n");
                }

            } else if (opcao == 5) { // Listar todos os filmes
                if (listaFilmes.isEmpty()) {
                    System.out.println("Nenhum filme cadastrado.\n");
                } else {
                    System.out.println("Lista de filmes cadastrados:");
                    for (Filme f : listaFilmes) {
                        f.imprimir();
                        System.out.println("--------------------");
                    }
                }

            } else if (opcao == 0) { // Sair
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Opcao invalida!\n");
            }

        } while (opcao != 0);

        leitor.close();
    }
}