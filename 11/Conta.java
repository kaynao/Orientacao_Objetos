public class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(Conta outra) {
        this(outra.numero, outra.titular, outra.saldo);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void atualizarSaldo(double valor) {
        this.saldo += valor;
    }

    public Conta copiar() {
        return new Conta(this);
    }

    @Override
    public String toString() {
        return "Conta{numero='" + numero + "', titular='" + titular + "', saldo=" + saldo + "}";
    }
}
