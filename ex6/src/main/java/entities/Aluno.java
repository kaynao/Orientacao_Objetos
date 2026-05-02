package entities;

/**
 *
 * @author kayna
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private String curso;
    private List<Telefone> lstTelefones;
    
    
    public Aluno(){
        this.nome = "";
        this.matricula = "";
        this.email = "";
        this.curso = "";
        List<Telefone> lstTelefones = new ArrayList<>();
    }
    
    public Aluno(String nome, String matricula, String email, String curso, List<Telefone> lstTelefones){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.curso = curso;
        
        this.lstTelefones = new ArrayList<>();
        for(Telefone t : lstTelefones){
            this.lstTelefones.add(new  Telefone(t));
        }
        
    }
    
    public Aluno(Aluno aluno){
        this.nome = aluno.getNome();
        this.matricula = aluno.getMatricula();
        this.email = aluno.getEmail();
        this.curso = aluno.getCurso();
        
        this.lstTelefones = new ArrayList<>();
        for(Telefone t : aluno.getLstTelefones()){
            this.lstTelefones.add(new Telefone (t));
        }
    }
    
    public void copiar(Aluno aluno){
        this.nome = aluno.getNome();
        this.matricula = aluno.getMatricula();
        this.email = aluno.getEmail();
        this.curso = aluno.getCurso();
        
        this.lstTelefones = new ArrayList<>();
        for(Telefone t : aluno.getLstTelefones()){
            this.lstTelefones.add(new Telefone (t));
        }
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome 
                + "Matricula: " + this.matricula
                + "Email: " + this.email
                + "Curso: " + this.curso;
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }

    public List<Telefone> getLstTelefones() {
        return lstTelefones;
    }

    public void setLstTelefones(List<Telefone> lstTelefones) {
        this.lstTelefones = lstTelefones;
    }
    
    
}
