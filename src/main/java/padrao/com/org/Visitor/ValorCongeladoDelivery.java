package padrao.com.org.Visitor;

public class ValorCongeladoDelivery implements Visitor {
    public double visitor(Salgados salgados) {
        return salgados.getValorPronta() - salgados.getValorCongelado() + salgados.getValorEntrega();
    }
}
