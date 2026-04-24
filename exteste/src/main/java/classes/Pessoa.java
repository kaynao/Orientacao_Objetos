package classes;

import java.util.Scanner;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;

    // Construtor padrão
    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Parabéns " + nome + "! Agora você tem " + idade + " anos.");
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Peso: " + peso + "kg");
    }

    public void preencherDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome: ");
        this.nome = leitor.nextLine();

        System.out.print("Idade: ");
        this.idade = leitor.nextInt();

        System.out.print("Peso: ");
        this.peso = leitor.nextDouble();
    }
}