package padrao.com.org.Comportamental.Visitor;

public class ValorEntrega implements Visitor {
    public double visitor(Salgados salgados) {
        return salgados.getValorEntrega() + salgados.getValorPronta();
    }
}
