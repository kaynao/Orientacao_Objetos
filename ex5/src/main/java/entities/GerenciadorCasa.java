package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;   

/**
 *
 * @author 12303802644
 */
public class GerenciadorCasa {
    private List<Casa> casas;

    public GerenciadorCasa() {
        this.casas = new ArrayList<>();
    }

    public void adicionarCasa(Casa casa) {
        casas.add(casa);
    }

    public boolean removerCasa(int cod) {
        Iterator<Casa> iterator = casas.iterator();
        while (iterator.hasNext()) {
            Casa casa = iterator.next();
            if (casa.getCod() == cod) {
                iterator.remove();
                return true;
            }
        }
        System.out.println("Casa não encontrada");
        return false;
    }

    public Casa encontrarCasa(String tipo) {
        for (Casa casa : casas) {
            if (casa.getTipo().equals(tipo)) {
                System.out.println("Casa encontrada");
                return casa;
            }
        }
        System.out.println("Não encontrada ou não existe");
        return null;
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCasa serializador = new SerializadorCasa();
        String jsonData = serializador.toJSON(casas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(jsonData, caminhoDoArquivo);
        System.out.println("Casas salvas com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String jsonData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCasa serializador = new SerializadorCasa();
        this.casas = serializador.fromJSON(jsonData);
        System.out.println("Casas carregadas com sucesso de " + caminhoDoArquivo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Casa casa : casas) {
            sb.append(casa.toString()).append("\n");
        }
        return sb.toString();
    }
}
