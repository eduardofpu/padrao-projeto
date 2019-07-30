package padrao.com.org.Decorator;

import java.math.BigDecimal;

public class CalculoPrecoComum implements CalculoPreco {
    public BigDecimal valorFinal(Produto produto) {

        BigDecimal imposto = new BigDecimal("0.10");
        BigDecimal valorfinal = produto.getValorUnitario().add(produto.getValorUnitario().multiply(imposto));
        return valorfinal;
    }
}
