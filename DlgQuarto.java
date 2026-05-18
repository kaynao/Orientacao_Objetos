package gerenciador;

import classes.Hospede;
import file.FilePersistence;
import file.Serializador;
import java.util.ArrayList;
import java.util.List;

public class GerenteHospede {

    private ArrayList<Hospede> listaHospedes;

    public GerenteHospede() {
        listaHospedes = new ArrayList<>();
    }

    public void adicionarHospede(Hospede h) {
        listaHospedes.add(h);
    }

    public void removeHospede(String cpf) {

        for (int i = 0; i < listaHospedes.size(); i++) {

            if (listaHospedes.get(i).getCpf().equals(cpf)) {

                listaHospedes.remove(i);
                break;
            }
        }
    }

    public Hospede buscarHospede(String cpf) {

        for (Hospede h : listaHospedes) {

            if (h.getCpf().equals(cpf)) {
                return h;
            }
        }

        return null;
    }

    public ArrayList<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {

        Serializador serializador = new Serializador();

        String csvData =
                serializador.toCSVHospedes(listaHospedes);

        FilePersistence filePersistence =
                new FilePersistence();

        filePersistence.saveToFile(
                csvData,
                caminhoDoArquivo
        );
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {

        FilePersistence filePersistence =
                new FilePersistence();

        String csvData =
                filePersistence.loadFromFile(caminhoDoArquivo);

        Serializador serializador =
                new Serializador();

        List<Hospede> lista =
                serializador.fromCSVHospedes(csvData);

        this.listaHospedes =
                new ArrayList<>(lista);
    }
}