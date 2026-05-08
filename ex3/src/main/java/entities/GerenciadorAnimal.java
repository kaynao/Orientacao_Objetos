package entities;

/**
 *
 * @author 12303802644
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class GerenciadorAnimal {
    private List<Animal> animais;

    public GerenciadorAnimal() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public boolean removerAnimal(String especie, String raca) {
        for(Animal animal : animais){
            if(animal.getEspecie().equals(especie) && animal.getRaca().equals(raca)){
                animais.remove(animal);
                return true;
            }
        }
        System.out.println("Arquivo não existe");
        return false;
    }

    public Animal encontrarAnimal(String especie, String raca) {
        for(Animal animal : animais){
            if(animal.getEspecie().equals(especie) && animal.getRaca().equals(raca)){
                System.out.println("Animal encontrado");
                return animal;
            }
        }
        System.out.println("Não encontrado ou não existe");
        return null;
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVAnimal serializador = new SerializadorCSVAnimal();
        String csvData = serializador.toCSV(animais);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);
        
        SerializadorCSVAnimal serializador = new SerializadorCSVAnimal();
        this.animais = serializador.fromCSV(csvData);
        
        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }
}
