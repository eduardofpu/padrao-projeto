package padrao.com.org.Comportamental.Visitor;

public class Salgados {

    private String tipo;
    private double valorPronta;
    private double valorCongelado;
    private double valorEntrega;

    public Salgados(String tipo, double valorPronta, double valorCongelado, double valorEntrega) {
        this.tipo = tipo;
        this.valorPronta = valorPronta;
        this.valorCongelado = valorCongelado;
        this.valorEntrega = valorEntrega;
    }

    public Object accept(Visitor visitor){
        return visitor.visitor(this);
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorPronta() {
        return valorPronta;
    }

    public double getValorCongelado() {
        return valorCongelado;
    }

    public double getValorEntrega() {
        return valorEntrega;
    }
}
