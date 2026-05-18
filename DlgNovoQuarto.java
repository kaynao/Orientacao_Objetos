package file;

import classes.Hospede;
import classes.Quarto;
import classes.Reserva;
import java.util.ArrayList;
import java.util.List;

public class Serializador {
    
    public String toCSVHospedes(List<Hospede> hospedes){
        String csv = "Nome;Cpf;Contato;Endereco;\n";
        for(Hospede h : hospedes){
            csv += h.getNome() + ";"
                    +h.getCpf() + ";"
                    +h.getContato() + ";"
                    +h.getEndereco() + ";\n";
        }
        return csv;
    }
    
    public String toCSVQuartos(List<Quarto> quartos){
        String csv = "Numero;Tipo;Preco;\n";
        for(Quarto q : quartos){
            csv += q.getNumero() + ";"
                    + q.getTipo() + ";"
                    + q.getPreco() + ";\n";
        }
        return csv;
    }
    
    public String toCSVReservas(List<Reserva> reservas){
        String csv =
                "Hospede;Quarto;CheckIn;CheckOut;\n";

        for(Reserva r : reservas){
            csv += r.getHospedes().toString() + ";"
                    + r.getQuarto().getNumero() + ";"
                    + r.getCheckIn() + ";"
                    + r.getCheckOut() + ";\n";
        }

        return csv;
    }
    
    public List<Hospede> fromCSVHospedes(String data){
        List<Hospede> hospedes = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for(int i = 1; i < linhas.length; i++){
            String[] partes = linhas[i].split(";");
            if(partes.length >= 4){
                Hospede hospede = new Hospede();
                hospede.setNome(partes[0]);
                hospede.setCpf(partes[1]);
                hospede.setContato(partes[2]);
                hospede.setEndereco(partes[3]);
                
                hospedes.add(hospede);
            }
        }
        return hospedes;
    }
    
    public List<Quarto> fromCSVQuartos(String data){
        List<Quarto> quartos = new ArrayList<>();

        String[] linhas = data.split("\n");

        for(int i = 1; i < linhas.length; i++){
            String[] partes = linhas[i].split(";");
            if(partes.length >= 3){
                Quarto quarto = new Quarto();
                quarto.setNumero(Integer.parseInt(partes[0]));
                quarto.setTipo(partes[1]);
                quarto.setPreco(Double.parseDouble(partes[2]));
                
                quartos.add(quarto);
            }
        }
        return quartos;
    }
    
    public List<Reserva> fromCSVReservas(String data){
        List<Reserva> reservas = new ArrayList<>();

        String[] linhas = data.split("\n");

        for(int i = 1; i < linhas.length; i++){

            String[] partes = linhas[i].split(";");

            if(partes.length >= 4){

                ArrayList<Hospede> hospedes =
                        new ArrayList<>();

                Hospede hospede = new Hospede();
                hospede.setNome(partes[0]);

                hospedes.add(hospede);

                Quarto quarto = new Quarto();

                quarto.setNumero(
                    Integer.parseInt(partes[1])
                );

                Reserva reserva = new Reserva();

                reserva.setHospedes(hospedes);

                reserva.setQuarto(quarto);

                reserva.setCheckIn(partes[2]);

                reserva.setCheckOut(partes[3]);

                reservas.add(reserva);

            }
        }

        return reservas;
    }
}
