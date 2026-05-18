package gerenciador;

import classes.Reserva;
import file.FilePersistence;
import file.Serializador;
import java.util.ArrayList;
import java.util.List;

public class GerenteReservas {

    private ArrayList<Reserva> listaReservas;

    public GerenteReservas() {
        listaReservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva r) {
        listaReservas.add(r);
    }

    public void removerReserva(int numeroQuarto) {

        for (int i = 0; i < listaReservas.size(); i++) {

            if (listaReservas.get(i)
                    .getQuarto()
                    .getNumero() == numeroQuarto) {

                listaReservas.remove(i);
                break;
            }
        }
    }

    public String listarReservas() {

        String texto = "";

        for (Reserva r : listaReservas) {
            texto += r.toString() + "\n";
        }

        return texto;
    }

    public ArrayList<Reserva> getListaReserva() {
        return listaReservas;
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {

        Serializador serializador = new Serializador();

        String csvData =
                serializador.toCSVReservas(listaReservas);

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

        List<Reserva> lista =
                serializador.fromCSVReservas(csvData);

        this.listaReservas =
                new ArrayList<>(lista);
    }
}