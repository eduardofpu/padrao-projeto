package padrao.com.org.Comportamental.Visitor;

public class ValorPronta implements Visitor {
    public double visitor(Salgados salgados) {
        return salgados.getValorPronta();
    }
}
