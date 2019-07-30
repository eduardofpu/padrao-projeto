package padrao.com.org.Decorator;

import java.math.BigDecimal;

public class CalculoPrecoComBrinde implements CalculoPreco {
    private  CalculoPreco calculo;

    /** A classe recebe uma subclasse**/
    public CalculoPrecoComBrinde(CalculoPreco calculo) {
        this.calculo = calculo;
    }

    public BigDecimal valorFinal(Produto produto) {

        BigDecimal valorFinal = calculo.valorFinal(produto);
        BigDecimal brinde = new BigDecimal("100.00");
        valorFinal = valorFinal.add(brinde);
        return valorFinal;
    }
}
