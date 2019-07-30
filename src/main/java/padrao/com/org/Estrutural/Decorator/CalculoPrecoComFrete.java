package padrao.com.org.Estrutural.Decorator;

import java.math.BigDecimal;

public class CalculoPrecoComFrete implements CalculoPreco {
    private  CalculoPreco calculo;

    /** A classe recebe uma subclasse**/
    public CalculoPrecoComFrete(CalculoPreco calculo) {
        this.calculo = calculo;
    }

    public BigDecimal valorFinal(Produto produto) {

        BigDecimal valorFinal = calculo.valorFinal(produto);
        BigDecimal frete;

        if(produto.getQuantidade() > 3){
            frete = new BigDecimal("11.00");
            valorFinal = valorFinal.add(frete);
            return valorFinal;
        }else {
            frete = new BigDecimal("17.00");
            valorFinal = valorFinal.add(frete);
            return valorFinal;
        }

    }
}
