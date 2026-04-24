package classes;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Ativo {
    private String nomeEmpresa;
    private double precoAcao;
    private double qtdAcoes;
    private double variacaoDiaria;
    
    public Ativo(){
        this.nomeEmpresa = "";
        this.precoAcao = 0.0;
        this.qtdAcoes = 0.0;
        this.variacaoDiaria = 0.0;
    }
    
    public Ativo(Ativo outro){
        this.nomeEmpresa = outro.getNomeEmpresa();
        this.precoAcao = outro.getPrecoAcao();
        this.qtdAcoes = outro.getQtdAcoes();
        this.variacaoDiaria = outro.getVariacaoDiaria();
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    
    public double getPrecoAcao() {
        return precoAcao;
    }

    public void setPrecoAcao(double precoAcao) {
        this.precoAcao = precoAcao;
    }

  
    public double getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(double qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

     public double getVariacaoDiaria() {
        return variacaoDiaria;
    }

    public void setVariacaoDiaria(double variacaoDiaria) {
        this.variacaoDiaria = variacaoDiaria;
    }
    
    public void preencher(Scanner leitor){
        setNomeEmpresa(leitor.nextLine());
        setPrecoAcao(leitor.nextDouble());
        setQtdAcoes(leitor.nextDouble());
        setVariacaoDiaria(leitor.nextDouble());
    }
    
    public void imprimir() {
        System.out.println("=== Dados do Ativo ===");
        System.out.println("Empresa: " + this.nomeEmpresa);
        System.out.printf("Preço: R$ %.2f%n", this.precoAcao);
        System.out.printf("Quantidade: %.2f%n", this.qtdAcoes);
        System.out.printf("Variação: %.2f%%%n", this.variacaoDiaria);
        System.out.println("----------------------");
    }
    
    public void calcularPosicaoDoAtivo(){
        double total = this.precoAcao * this.qtdAcoes;
        System.out.printf("%-20s | Preço: R$ %8.2f | Qtd: %10.2f | Var: %6.2f%% | Total: R$ %12.2f%n", 
        this.nomeEmpresa, 
        this.precoAcao, 
        this.qtdAcoes, 
        this.variacaoDiaria,
        total
    );
    }
}
