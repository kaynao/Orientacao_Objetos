package com.mycompany.ex6;

import java.util.Scanner;
import classes.Produto;
import classes.Estoque;
        
public class Ex6 {
    private static Estoque estoque = new Estoque();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao;
        
        do {
            exibirMenu();
            opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    atualizarQuantidade();
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 5:
                    buscarProduto();
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
            if (opcao != 6) {
                System.out.println("\nPressione ENTER para continuar...");
                scanner.nextLine(); // Limpar buffer
                scanner.nextLine(); // Aguardar ENTER
            }
            
        } while (opcao != 6);
        
        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE GERENCIAMENTO DE ESTOQUE ===");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Remover Produto");
        System.out.println("3. Atualizar Quantidade");
        System.out.println("4. Listar Produtos");
        System.out.println("5. Buscar Produto");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private static void adicionarProduto() {
        System.out.println("\n--- ADICIONAR PRODUTO ---");
        
        try {
            System.out.print("Código do produto: ");
            int codigo = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();
            
            System.out.print("Quantidade inicial: ");
            int quantidade = Integer.parseInt(scanner.nextLine());
            
            Produto produto = new Produto(codigo, nome, quantidade);
            
            if (estoque.adicionarProduto(produto)) {
                System.out.println("Produto adicionado com sucesso!");
            } else {
                System.out.println("Erro: Já existe um produto com este código!");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor numérico inválido!");
        }
    }
    
    private static void removerProduto() {
        System.out.println("\n--- REMOVER PRODUTO ---");
        
        try {
            System.out.print("Código do produto a remover: ");
            int codigo = Integer.parseInt(scanner.nextLine());
            
            Produto produto = estoque.buscarProdutoPorCodigo(codigo);
            if (produto != null) {
                System.out.println("Produto encontrado: " + produto);
                System.out.print("Confirma remoção? (S/N): ");
                String confirmacao = scanner.nextLine();
                
                if (confirmacao.equalsIgnoreCase("S")) {
                    if (estoque.removerProduto(codigo)) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Erro ao remover produto!");
                    }
                } else {
                    System.out.println("Remoção cancelada.");
                }
            } else {
                System.out.println("Produto não encontrado!");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: Código inválido!");
        }
    }
    
    private static void atualizarQuantidade() {
        System.out.println("\n--- ATUALIZAR QUANTIDADE ---");
        
        try {
            System.out.print("Código do produto: ");
            int codigo = Integer.parseInt(scanner.nextLine());
            
            Produto produto = estoque.buscarProdutoPorCodigo(codigo);
            if (produto != null) {
                System.out.println("Produto atual: " + produto);
                System.out.print("Nova quantidade: ");
                int novaQuantidade = Integer.parseInt(scanner.nextLine());
                
                if (novaQuantidade >= 0) {
                    if (estoque.atualizarQuantidade(codigo, novaQuantidade)) {
                        System.out.println("Quantidade atualizada com sucesso!");
                        System.out.println("Produto atualizado: " + estoque.buscarProdutoPorCodigo(codigo));
                    } else {
                        System.out.println("Erro ao atualizar quantidade!");
                    }
                } else {
                    System.out.println("Quantidade não pode ser negativa!");
                }
            } else {
                System.out.println("Produto não encontrado!");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor numérico inválido!");
        }
    }
    
    private static void listarProdutos() {
        System.out.println("\n--- LISTA DE PRODUTOS ---");
        
        java.util.List<Produto> produtos = estoque.listarProdutos();
        
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio!");
        } else {
            System.out.println("Total de produtos: " + produtos.size());
            System.out.println("----------------------------------------");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
            System.out.println("----------------------------------------");
        }
    }
    
    private static void buscarProduto() {
        System.out.println("\n--- BUSCAR PRODUTO ---");
        
        try {
            System.out.print("Código do produto: ");
            int codigo = Integer.parseInt(scanner.nextLine());
            
            Produto produto = estoque.buscarProdutoPorCodigo(codigo);
            
            if (produto != null) {
                System.out.println("Produto encontrado:");
                System.out.println(produto);
            } else {
                System.out.println("Produto não encontrado!");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: Código inválido!");
        }
    }
}