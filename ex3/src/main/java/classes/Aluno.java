package classes;

import java.util.Scanner;
/**
 *
 * @author kayna
 */
public class Aluno {
    //Atributos
    private String nome;
    private int idade;
    private String matricula;
    private int anoIngresso;
    
    //Metodos
    //Construtor
    public Aluno(){
        this.nome = "";
        this.idade = 0;
        this.matricula = "";
        this.anoIngresso = 0;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }
    
    //Construtor Copia
    public Aluno(Aluno outro){
        this.nome = outro.getNome();
        this.idade = outro.getIdade();
        this.matricula = outro.getMatricula();
        this.anoIngresso = outro.getAnoIngresso();
    }
    
    //imprimir
    public void imprimir(){
        System.out.println("Nome = " + this.nome);
        System.out.println("Idade = " + this.idade);
        System.out.println("Matricula = " + this.matricula);
        System.out.println("Ano Ingresso = " + this.anoIngresso);
    }
    
    public void fill(Scanner leitor){
        System.out.print("Nome: ");
        setNome(leitor.nextLine());
        System.out.print("Idade: ");
        setIdade(leitor.nextInt());
        leitor.nextLine();
        System.out.print("Matricula: ");
        setMatricula(leitor.nextLine());
        System.out.print("Ano de Ingresso:");
        setAnoIngresso(leitor.nextInt());
    }
}
