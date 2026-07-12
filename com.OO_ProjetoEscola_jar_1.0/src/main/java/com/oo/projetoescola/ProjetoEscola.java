package com.oo.projetoescola;

import com.oo.projetoescola.gui.FrMenuPrincipal;
import java.sql.SQLException;

public class ProjetoEscola {

    public static void main(String[] args) throws SQLException {
        FrMenuPrincipal telaPrincipal = new FrMenuPrincipal();
        telaPrincipal.setVisible(true);
    }
}
