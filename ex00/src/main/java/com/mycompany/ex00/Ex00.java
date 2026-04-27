package com.mycompany.ex00;

/**
 *
 * @author 12303802644
 */

import entities.Carro;
import entities.Motorista;

import java.util.Scanner;

public class Ex00 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Carro meuCarro = new Carro("Fusca", 1970, "verde");

        Motorista motorista = new Motorista("Jose Rui", meuCarro);

        motorista.dirigir();
        motorista.getCarro().abrirPorta();
        System.out.println(motorista);

        Scanner scanner = new Scanner(System.in);
        Motorista motorista2 = new Motorista();
        motorista2.fill(scanner);
        motorista2.dirigir();
        motorista2.getCarro().abrirPorta();
        System.out.println(motorista2);
    }
}
