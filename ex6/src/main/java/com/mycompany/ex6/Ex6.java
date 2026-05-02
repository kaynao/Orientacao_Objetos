package com.mycompany.ex6;

/**
 *
 * @author kayna
 */

import java.util.Scanner;
import entities.Aluno;
import entities.Telefone;
import java.util.List;
import java.util.ArrayList;

public class Ex6 {
    
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Cadastro de Aluno ===");
    Aluno a1 = fillAluno(leitor);
    
    // Exibe os dados
    System.out.println("\n=== Dados Cadastrados ===");
    System.out.println("Nome: " + a1.getNome());
    System.out.println("Matrícula: " + a1.getMatricula());
    System.out.println("Email: " + a1.getEmail());
    System.out.println("Curso: " + a1.getCurso());
    
    System.out.println("Telefones:");
    for(Telefone t : a1.getLstTelefones()){
        System.out.println("  " + t.getDdd() + " " + t.getNumero() + 
                           " - " + t.getDescricao() + " (" + t.getOperadora() + ")");
    }
    
    // Testa o construtor de cópia
    Aluno a2 = new Aluno(a1);
    System.out.println("\n=== Cópia do Aluno ===");
    System.out.println("Nome: " + a2.getNome());
    
    // Prova que é cópia profunda — alterar a2 não afeta a1
    a2.setNome("Nome Alterado");
    System.out.println("a1 nome: " + a1.getNome()); // continua o original
    System.out.println("a2 nome: " + a2.getNome()); // alterado
    }
    
    public static Telefone fillTelefone(Scanner leitor){
        System.out.println("DDD: ");
        String ddd = leitor.next();
        System.out.println("Numero: ");
        String numero = leitor.next();
        System.out.println("Descricao: ");
        String descricao = leitor.next();
        System.out.println("Operadora: ");
        String operadora = leitor.next();
        
        return new Telefone(ddd,numero,descricao,operadora);
    }
    
    public static Aluno fillAluno(Scanner leitor){
        System.out.println("Nome: ");
        String nome = leitor.next();
        System.out.println("Matricula: ");
        String matricula = leitor.next();
        System.out.println("Email: ");
        String email = leitor.next();
        System.out.println("Curso: ");
        String curso = leitor.next();
        
        List<Telefone> lstTelefones = new ArrayList<>();
        
        System.out.println("Quantos Telefones? ");
        int qtdTelefones = leitor.nextInt();
        
        for(int i = 0; i < qtdTelefones;i++){
            Telefone t = new Telefone();
            System.out.println("Telefone " + (i + 1) + " :");
            lstTelefones.add(fillTelefone(leitor));
        }
        
        return new Aluno(nome,matricula,email,curso,lstTelefones);
        
    }
}
