import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private List<Transacao> transacoes;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.transacoes = new ArrayList<>();
    }

    public Banco(Banco outro) {
        this(outro.nome);
        for (Conta c : outro.contas) {
            this.contas.add(c.copiar());
        }
        for (Transacao t : outro.transacoes) {
            this.transacoes.add(t.copiar());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        List<Conta> copia = new ArrayList<>();
        for (Conta c : contas) {
            copia.add(c.copiar());
        }
        return copia;
    }

    public void setContas(List<Conta> contas) {
        this.contas = new ArrayList<>();
        for (Conta c : contas) {
            this.contas.add(c.copiar());
        }
    }

    public List<Transacao> getTransacoes() {
        List<Transacao> copia = new ArrayList<>();
        for (Transacao t : transacoes) {
            copia.add(t.copiar());
        }
        return copia;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = new ArrayList<>();
        for (Transacao t : transacoes) {
            this.transacoes.add(t.copiar());
        }
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta.copiar());
    }

    public void removerConta(Conta conta) {
        contas.removeIf(c -> c.getNumero().equals(conta.getNumero()));
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao.copiar());
    }

    public void removerTransacao(Transacao transacao) {
        transacoes.removeIf(t -> t.getId().equals(transacao.getId()));
    }

    public Banco copiar() {
        return new Banco(this);
    }

    @Override
    public String toString() {
        return "Banco{nome='" + nome + "', contas=" + contas + ", transacoes=" + transacoes + "}";
    }
}
