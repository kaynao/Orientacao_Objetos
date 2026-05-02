package com.mycompany.ex5;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import entities.Carro;
import entities.GerenciadorPropietario;
import entities.Propietario;
import entities.Roda;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
        GerenciadorPropietario ttt = new GerenciadorPropietario();
        
        Propietario p1 = fillPropietario(leitor);
        Carro c1 = fillCarro(leitor);
    }
    
    public static Propietario fillPropietario(Scanner leitor){
        System.out.println("Nome: ");
        String nome = leitor.next();
        System.out.println("CPF: ");
        String cpf = leitor.next();
        System.out.println("Email: ");
        String email = leitor.next();
        
        List<Carro> lstCarros = new ArrayList<>();
        System.out.println("Quantos carros? ");
        int qtdCarros = leitor.nextInt();
        for(int i = 0; i < qtdCarros; i++){
            System.out.println("Carro " + (i + 1) + ":");
            lstCarros.add(fillCarro(leitor));
        }
        
        return new Propietario(nome,cpf,email,lstCarros);
    }
    
    public static Carro fillCarro(Scanner leitor){
        System.out.println("Fabricante: ");
        String fabricante = leitor.next();
        System.out.println("Modelo: ");
        String modelo = leitor.next();
        System.out.println("Cor: ");
        String cor = leitor.next();
        
        List<Roda> lstRodas = new ArrayList<>();
        
        Carro carro = new Carro(fabricante,modelo,cor);
        
        System.out.println("Quantas rodas?");
        int qtdRodas = leitor.nextInt();
        for(int i = 0; i < qtdRodas; i++){
            System.out.println("Roda " + (i + 1) + ":");
            carro.getLstRodas().add(fillRoda(leitor));
        }
        
        return carro;
    }
    
    public static Roda fillRoda(Scanner leitor){
        System.out.println("Raio: ");
        double raio = leitor.nextDouble();
        System.out.println("Material: ");
        String material = leitor.next();
        System.out.println("Cor: ");
        String cor = leitor.next();
        return new Roda(raio,material,cor);
    }
    
}
