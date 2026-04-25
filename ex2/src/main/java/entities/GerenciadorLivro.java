package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorLivro {
    private List<Livro> livros;
    
    public GerenciadorLivro(){//Construtor
        livros = new ArrayList<>();
    }
    
    public void AdicionarLivro(int n,Scanner leitor){
        for(int i = 0; i <= n - 1; i++){
            Livro l1 = new Livro();
            l1.fill(leitor);
            livros.add(l1);
        }
    }  
    
    public void ImprimirNomeDaBiblioteca(){
        for (int i = 0; i <= livros.size() - 1; i++){
            Livro l1 = livros.get(i);
            System.out.println("Nome da Biblioteca: ");
            System.out.println(l1.getNomeDaBiblioteca());
        }
    }
}
