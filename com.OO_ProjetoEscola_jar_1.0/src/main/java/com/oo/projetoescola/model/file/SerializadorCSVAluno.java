package com.oo.projetoescola.model.file;

import com.oo.projetoescola.model.entities.Aluno;
import java.util.ArrayList;
import java.util.List;


public class SerializadorCSVAluno implements ISerializador<Aluno> {

    @Override
    public String toFile(List<Aluno> lista) {
        String csv = "Matricula;Nome;Curso;Idade;\n";
        for (Aluno a : lista) {
            csv += a.getMatricula() + ";"
                    + a.getNome() + ";"
                    + a.getCurso() + ";"
                    + a.getIdade() + ";\n";
        }
        return csv;
    }

    @Override
    public List<Aluno> fromFile(String data) {
        List<Aluno> lista = new ArrayList<>();

        String[] linhas = data.split("\n");
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Aluno a = new Aluno();
                a.setMatricula(partes[0]);
                a.setNome(partes[1]);
                a.setCurso(partes[2]);
                a.setIdade(Integer.parseInt(partes[3]));

                lista.add(a);
            }
        }
        return lista;
    }
}
