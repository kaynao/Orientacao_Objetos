

package com.oo.projetoescola.model.file;

import java.util.List;


public interface ISerializador<T> {

    String toFile(List<T> lista);

    List<T> fromFile(String data);
}
