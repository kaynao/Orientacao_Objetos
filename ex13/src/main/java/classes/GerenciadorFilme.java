package classes;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorFilme {
    
    //Atributos
    private ArrayList<Filme> filmes;
    
    //Metodos
    public GerenciadorFilme(){
       this.filmes = new ArrayList<>();
    }
    //Adicionar Filme
    public void addFilme(Filme f) {
    if (f != null)
        filmes.add(f.copiar());
    }   
    
    public boolean removeFilme(String titulo) {
    for (int i = 0; i < filmes.size(); i++) {
        if (filmes.get(i).getTitulo().equalsIgnoreCase(titulo)) {
            filmes.remove(i);
            return true;
        }
    }
    return false;
    }
    
    // Pesquisar por título
    public Filme buscarPorTitulo(String titulo) {
        for (Filme f : filmes) {
            if (f.getTitulo().equalsIgnoreCase(titulo))
                return f.copiar();
        }
        return null; // não encontrou
    }

    // Pesquisar por autor/diretor
    public ArrayList<Filme> buscarPorAutor(String autor) {
        ArrayList<Filme> resultado = new ArrayList<>();
        for (Filme f : filmes) {
            if (f.getAutor().equalsIgnoreCase(autor))
                resultado.add(f.copiar());
        }
        return resultado;
    }
    
}
