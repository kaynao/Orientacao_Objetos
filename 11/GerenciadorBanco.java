import java.util.List;

public class GerenciadorBanco {
    private Banco banco;

    public GerenciadorBanco(Banco banco) {
        this.banco = banco.copiar();
    }

    public GerenciadorBanco(GerenciadorBanco outro) {
        this(outro.banco);
    }

    public Banco getBanco() {
        return banco.copiar();
    }

    public void setBanco(Banco banco) {
        this.banco = banco.copiar();
    }

    public void listarContas() {
        for (Conta c : banco.getContas()) {
            System.out.println(c);
        }
    }

    public void listarTransacoes() {
        for (Transacao t : banco.getTransacoes()) {
            System.out.println(t);
        }
    }

    public Conta contaComMaiorSaldo() {
        List<Conta> contas = banco.getContas();
        if (contas.isEmpty()) return null;
        Conta maior = contas.get(0);
        for (Conta c : contas) {
            if (c.getSaldo() > maior.getSaldo()) {
                maior = c;
            }
        }
        return maior.copiar();
    }

    public Conta contaComMenorSaldo() {
        List<Conta> contas = banco.getContas();
        if (contas.isEmpty()) return null;
        Conta menor = contas.get(0);
        for (Conta c : contas) {
            if (c.getSaldo() < menor.getSaldo()) {
                menor = c;
            }
        }
        return menor.copiar();
    }

    public String totalDeDevedores() {
        int quantidade = 0;
        double soma = 0.0;
        for (Conta c : banco.getContas()) {
            if (c.getSaldo() < 0) {
                quantidade++;
                soma += c.getSaldo();
            }
        }
        return "Quantidade de devedores: " + quantidade + ", Somatório dos saldos negativos: " + soma;
    }

    public String totalDeCredores() {
        int quantidade = 0;
        double soma = 0.0;
        for (Conta c : banco.getContas()) {
            if (c.getSaldo() > 0) {
                quantidade++;
                soma += c.getSaldo();
            }
        }
        return "Quantidade de credores: " + quantidade + ", Somatório dos saldos positivos: " + soma;
    }

    public GerenciadorBanco copiar() {
        return new GerenciadorBanco(this);
    }

    @Override
    public String toString() {
        return "GerenciadorBanco{banco=" + banco + "}";
    }
}
