package classes;

import java.util.ArrayList;

public class Reserva {
    private ArrayList<Hospede> hospedes;
    private Quarto quarto;
    private String checkIn;
    private String checkOut;

    public Reserva(ArrayList<Hospede> hospedes, Quarto quarto, String checkIn, String checkOut) {
        this.hospedes = hospedes;
        this.quarto = quarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    public Reserva(){
        
    }

    public ArrayList<Hospede> getHospedes() {
        return hospedes;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setHospedes(ArrayList<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
    
    @Override
    public String toString(){

        String nomes = "";

        for(Hospede h : hospedes){

            nomes += h.getNome() + ", ";

        }

        return nomes
                + "- Quarto "
                + quarto.getNumero()
                + " - "
                + checkIn
                + " até "
                + checkOut;

    }
}
