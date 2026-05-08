package entities;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author 12303802644
 */

public class SerializadorCSVAnimal {
    public String toCSV(List<Animal> animais){
        String csv = "Nome;Custo;Preco;\n";
        for (Animal animal : animais) {
            csv += animal.getEspecie() + ";"
                + animal.getRaca()+ ";"
                + animal.getIdade() + ";"
                + animal.getPeso() + ";\n";
        }
        return csv;
    }
    
    public List<Animal> fromCSV(String data) {
        List<Animal> animais = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 3) {
                Animal animal = new Animal();
                animal.setEspecie(partes[0]);
                animal.setRaca(partes[1]);
                animal.setIdade(Integer.parseInt(partes[2]));
                animal.setPeso(Double.parseDouble(partes[3]));

                animais.add(animal);
            }
        }
        return animais;
    }
    
}
