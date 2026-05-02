package entities;

/**
 *
 * @author kayna
 */

import java.util.Scanner;

public class Telefone {
    private String ddd;
    private String numero;
    private String descricao;
    private String operadora;
    
    public Telefone(){
        this.ddd = "";
        this.numero = "";
        this.descricao = "";
        this.operadora = "";
    }
    
    public Telefone(String ddd, String numero, String descricao, String operadora){
        this.ddd = ddd;
        this.numero = numero;
        this.descricao = descricao;
        this.operadora = operadora;
    }
    
    public Telefone(Telefone telefone){
        this.ddd = telefone.getDdd();
        this.numero = telefone.getNumero();
        this.descricao = telefone.getDescricao();
        this.operadora = telefone.getOperadora();
    }
    
    public void copiar(Telefone telefone){
        this.ddd = telefone.getDdd();
        this.numero = telefone.getNumero();
        this.descricao = telefone.getDescricao();
        this.operadora = telefone.getOperadora();
    }
    
    @Override
    public String toString(){
        return "DDD: " + this.ddd
                + "Numero : " + this.numero
                + "Descricao: " + this.descricao
                + "Operadora: " + this.operadora;
    }
    
    public void imprimir(){
        System.out.println(this);
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    
}
