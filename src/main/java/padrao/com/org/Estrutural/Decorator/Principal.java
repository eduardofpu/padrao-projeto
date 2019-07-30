package padrao.com.org.Estrutural.Decorator;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("CD Legião Urbana");
        produto.setQuantidade(4);
        produto.setValorUnitario(new BigDecimal("40.00"));

        /** A interface decora uma classe que recebe uma subclasse**/
        //CalculoPreco calculo = new CalculoPrecoComFrete(new CalculoPrecoComum());
        CalculoPreco calculo = new CalculoPrecoComBrinde(new CalculoPrecoComum());

        /** adicionando dinamicamente os objetos**/
        //CalculoPreco calculo = new CalculoPrecoComBrinde(new CalculoPrecoComFrete(new CalculoPrecoComum()));


        BigDecimal preco = calculo.valorFinal(produto);
        System.out.println("R$ " + preco.doubleValue());

    }
}
