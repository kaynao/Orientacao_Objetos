public class Transacao {
    private String id;
    private String tipo;
    private double valor;
    private String data;
    private Conta conta;

    public Transacao(String id, String tipo, double valor, String data, Conta conta) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.conta = conta.copiar();
    }

    public Transacao(Transacao outra) {
        this(outra.id, outra.tipo, outra.valor, outra.data, outra.conta);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta.copiar();
    }

    public void setConta(Conta conta) {
        this.conta = conta.copiar();
    }

    public Transacao copiar() {
        return new Transacao(this);
    }

    @Override
    public String toString() {
        return "Transacao{id='" + id + "', tipo='" + tipo + "', valor=" + valor + ", data='" + data + "', conta=" + conta + "}";
    }
}
