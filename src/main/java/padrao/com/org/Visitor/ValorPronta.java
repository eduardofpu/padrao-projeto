package padrao.com.org.Visitor;

public class ValorPronta implements Visitor {
    public double visitor(Salgados salgados) {
        return salgados.getValorPronta();
    }
}
