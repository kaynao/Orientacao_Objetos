import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    private String nome;
    private String cpf;
    private String email;
    private List<Carro> carros;

    // Construtor completo
    public Proprietario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.carros = new ArrayList<>();
    }

    // Construtor de cópia (abordagem delegação)
    public Proprietario(Proprietario outro) {
        this(outro.nome, outro.cpf, outro.email);
        // Cópia defensiva dos carros (agregação: copia os objetos)
        for (Carro c : outro.carros) {
            this.carros.add(c.copiar());
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Carro> getCarros() {
        // Retorna cópia defensiva da lista
        List<Carro> copia = new ArrayList<>();
        for (Carro c : carros) {
            copia.add(c.copiar());
        }
        return copia;
    }

    // Adicionar carro (recebe cópia — delegação)
    public void adicionarCarro(Carro carro) {
        this.carros.add(carro.copiar());
    }

    // Verificar se possui carro de determinado fabricante
    public boolean possuiCarroDe(String fabricante) {
        for (Carro c : carros) {
            if (c.getFabricante().equalsIgnoreCase(fabricante)) {
                return true;
            }
        }
        return false;
    }

    // Copiar (delegação para construtor de cópia)
    public Proprietario copiar() {
        return new Proprietario(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Proprietario[nome=%s, cpf=%s, email=%s]%n",
                nome, cpf, email));
        sb.append("  Carros:\n");
        for (Carro c : carros) {
            sb.append(c);
        }
        return sb.toString();
    }
}
