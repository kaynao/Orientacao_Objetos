package com.oo.projetoescola.model.file;

import com.oo.projetoescola.model.entities.Professor;
import java.util.ArrayList;
import java.util.List;


public class SerializadorCSVProfessor implements ISerializador<Professor> {

    @Override
    public String toFile(List<Professor> lista) {
        String csv = "Codigo;Nome;Especializacao;CargaHoraria;\n";
        for (Professor p : lista) {
            csv += p.getCodigo() + ";"
                    + p.getNome() + ";"
                    + p.getEspecializacao() + ";"
                    + p.getCargaHoraria() + ";\n";
        }
        return csv;
    }

    @Override
    public List<Professor> fromFile(String data) {
        List<Professor> lista = new ArrayList<>();

        String[] linhas = data.split("\n");
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Professor p = new Professor();
                p.setCodigo(partes[0]);
                p.setNome(partes[1]);
                p.setEspecializacao(partes[2]);
                p.setCargaHoraria(Integer.parseInt(partes[3]));

                lista.add(p);
            }
        }
        return lista;
    }
}
