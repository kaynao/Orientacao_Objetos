package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorReservas {
    //Atributos
    private ArrayList<Reserva> listaReserva;
    
    //Metodos
    public GerenciadorReservas(){//Construtor
        this.listaReserva = new ArrayList<>();
    }
    
    public void AdicionarReserva(Reserva r){
        listaReserva.add(r);
    }
    
    public boolean RemoverReserva(Reserva reserva){
        if(listaReserva.isEmpty()){
            System.out.println("A lista esta vazia.");
        }else{
            for(int i = 0; i <= listaReserva.size() - 1; i++){
                Reserva r1 = listaReserva.get(i);
                if(r1.equals(reserva)){
                    listaReserva.remove(r1);
                    return true;
                }
            }
        }
    return false;
    }
    
    public Reserva BuscarReserva(Reserva reserva){
        if(listaReserva.isEmpty()){
            System.out.println("A lista esta vazia.");
        }else{
            for(int i = 0; i <= listaReserva.size() - 1; i++){
                Reserva r1 = listaReserva.get(i);
                if(r1.equals(reserva)){
                    return r1;
                }
            }
        }
    return null;
    }
}
