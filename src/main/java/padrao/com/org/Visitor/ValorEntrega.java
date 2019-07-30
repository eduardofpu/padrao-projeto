package padrao.com.org.Visitor;

public class ValorEntrega implements Visitor {
    public double visitor(Salgados salgados) {
        return salgados.getValorEntrega() + salgados.getValorPronta();
    }
}
