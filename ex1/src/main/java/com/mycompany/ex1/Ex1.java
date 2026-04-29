package com.mycompany.ex1;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import entities.Pedido;
import entities.Produto;

public class Ex1 {

    public static void main(String[] args) {
    // Cria um produto
    Produto p1 = new Produto("Teclado Mecânico", "Informática", 350.00);

    // Cria um pedido associado ao produto
    Pedido pedido1 = new Pedido("1001", "16/03/2026", 3, p1);

    // Calcula e exibe o total
    System.out.println(pedido1);
    System.out.println("Total do pedido: R$" + pedido1.calcularTotal());

    // Exemplo preenchido pelo usuário
    Scanner leitor = new Scanner(System.in);
    Pedido pedido2 = new Pedido();
    pedido2.criarPedido(leitor);
    System.out.println(pedido2);
    System.out.println("Total do pedido: R$" + pedido2.calcularTotal());
    // ...
    }
}
