package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 12303802644
 */
public class SerializadorCasa {
    public String toJSON(List<Casa> casas) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < casas.size(); i++) {
            Casa c = casas.get(i);
            sb.append("  {\n");
            sb.append("    \"tipo\": \"").append(c.getTipo()).append("\",\n");
            sb.append("    \"quartos\": ").append(c.getQuartos()).append(",\n");
            sb.append("    \"banheiros\": ").append(c.getBanheiros()).append(",\n");
            sb.append("    \"area\": ").append(c.getArea()).append(",\n");
            sb.append("    \"preco\": ").append(c.getPreco()).append("\n");
            sb.append("  }");
            if (i < casas.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    public List<Casa> fromJSON(String data) {
        List<Casa> casas = new ArrayList<>();
        // Remove colchetes e divide por objeto {}
        data = data.trim().replaceAll("^\\[|\\]$", "");
        String[] objetos = data.split("\\},\\s*\\{");

        for (String obj : objetos) {
            obj = obj.replaceAll("[\\{\\}]", "").trim();
            if (obj.isEmpty()) continue;

            Casa casa = new Casa();
            String[] campos = obj.split(",\n");
            for (String campo : campos) {
                String[] partes = campo.trim().split(":\\s*", 2);
                if (partes.length < 2) continue;
                String chave = partes[0].trim().replaceAll("\"", "");
                String valor = partes[1].trim().replaceAll("\"", "");
                switch (chave) {
                    case "tipo":      casa.setTipo(valor); break;
                    case "quartos":   casa.setQuartos(Integer.parseInt(valor)); break;
                    case "banheiros": casa.setBanheiros(Integer.parseInt(valor)); break;
                    case "area":      casa.setArea((int) Double.parseDouble(valor)); break;
                    case "preco":     casa.setPreco(Double.parseDouble(valor)); break;
                }
            }
            casas.add(casa);
        }
        return casas;
    }
}
