package com.mycompany.ex2;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import entities.Cliente;
import entities.ContaBancaria;

public class Ex2 {
    
    public static ContaBancaria criarContaBancaria(Scanner leitor) {
        System.out.println("  -- Dados da Conta Bancária --");
        System.out.print("  Número: ");
        int numero = leitor.nextInt();
        leitor.nextLine();
        
        System.out.print("  Tipo (corrente/poupança): ");
        String tipo = leitor.nextLine();
        
        System.out.print("  Saldo inicial: R$");
        double saldo = leitor.nextDouble();
        leitor.nextLine();
        
        return new ContaBancaria(numero, tipo, saldo);
    }
    
    public static Cliente criarCliente(Scanner leitor) {
        System.out.println("-- Dados do Cliente --");
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        
        System.out.print("CPF: ");
        String cpf = leitor.nextLine();
        
        ContaBancaria conta = criarContaBancaria(leitor);
        
        return new Cliente(nome, cpf, conta);
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // -------------------------------------------
        // Exemplo 1 — construtor com parâmetros
        // -------------------------------------------
        ContaBancaria conta1 = new ContaBancaria(1001, "corrente", 500.0);
        Cliente c1 = new Cliente("João", "111.222.333-44", conta1);

        System.out.println(c1);

        // O cliente deposita — ele delega para a conta
        c1.depositando(200.0);
        c1.sacando(50.0);

        System.out.println(c1); // saldo atualizado

        // -------------------------------------------
        // Exemplo 2 — preenchido pelo usuário
        // -------------------------------------------
        Cliente c2 = criarCliente(leitor);
        System.out.println(c2);

        System.out.print("Informe o valor do depósito: R$");
        double valor = leitor.nextDouble();
        leitor.nextLine();

        c2.depositando(valor);
        System.out.println(c2); // saldo atualizado
        
        System.out.print("Informe o valor para sacar: R$");
        valor = leitor.nextDouble();
        leitor.nextLine();
        
        c2.sacando(valor);
        System.out.println(c2); // saldo atualizado
    }
}
