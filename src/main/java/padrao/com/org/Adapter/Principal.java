package padrao.com.org.Adapter;

public class Principal {

    public static void main(String[] args) {
        CotacaoAdapter cotacao = new CotacaoAdapter();
        cotacao.setValor(1.00);
        System.out.println("R$ " + cotacao.getValor());
        System.out.println("$ " + cotacao.getValorDolar());
    }
}