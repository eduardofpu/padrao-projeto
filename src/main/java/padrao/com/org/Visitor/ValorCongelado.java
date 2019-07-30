package padrao.com.org.Visitor;

public class ValorCongelado implements Visitor {
    public double visitor(Salgados salgados) {
        return salgados.getValorPronta() - salgados.getValorCongelado();
    }
}
