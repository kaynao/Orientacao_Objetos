package classes;

import java.io.Serializable;

public class Hospede {
    private String nome;
    private String cpf;
    private String contato;
    private String endereco;
    
    public Hospede(String nome, String cpf, String contato, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
    }
    
    public Hospede(){
        this.nome  = "";
        this.cpf = "";
        this.contato = "";
        this.endereco = "";
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getContato() {
        return contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "   |   Cpf: " + cpf + "   |   Contato: " + contato + "   |   Endereco: " + endereco + "\n";
    }
}
