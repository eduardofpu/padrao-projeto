package padrao.com.org.Comportamental.Visitor;

public class ValorCongelado implements Visitor {
    public double visitor(Salgados salgados) {
        return salgados.getValorPronta() - salgados.getValorCongelado();
    }
}
