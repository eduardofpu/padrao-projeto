package padrao.com.org.Comportamental.Visitor;

public class Client {

    public static void main(String[] args) {
        Salgados coxinha = new Salgados("Coxinha",1.0,0.2,0.5);

        ValorCongelado desconto = new ValorCongelado();
        ValorPronta taNaMesa = new ValorPronta();
        ValorEntrega coxinhasDelivery = new ValorEntrega();
        ValorCongeladoDelivery fritarNaCasaDoCrush = new ValorCongeladoDelivery();

        System.out.println("Valor da coxinha Pronta "+coxinha.accept(taNaMesa));
        System.out.println("Valor da coxinha Congelada "+coxinha.accept(desconto));
        System.out.println("Valor da coxinha na sua casa (Delivery) "+coxinha.accept(coxinhasDelivery));
        System.out.println("Valor da coxinha na sua Casa "+coxinha.accept(fritarNaCasaDoCrush));

    }
}
