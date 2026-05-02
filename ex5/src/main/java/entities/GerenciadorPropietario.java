package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorPropietario {
    //Atributos
    private List<Propietario> lstPropietario;
    
    //Metodos
    public GerenciadorPropietario(){
        this.lstPropietario = new ArrayList<>();
    }
    
    public void addPropietario(Propietario p){
        lstPropietario.add(p);
    }
    
    public void removerPropietario(Propietario p){
        for(Propietario prop : lstPropietario){
            if(prop.equals(p)){
                lstPropietario.remove(prop);
                System.out.println("Removido com Sucesso!!!");
            }
        }
        System.out.println("Valor invalido ou inexistente.");
    }
    
    public Propietario buscarPropietario(Propietario p){
        for(Propietario prop : lstPropietario){
            if(prop.equals(p)){
                System.out.println("Propietario encontrado");
                return prop;
            }
        }
        System.out.println("Propietario não encontrado");
        return null;
    }
    
    
}
