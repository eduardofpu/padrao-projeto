package padrao.com.org.Strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        Contexto contexto = new Contexto(new Soma());

        System.out.println("Chamando soma -> " + contexto.executarStrategy(10, 5));

        System.out.println();

        contexto = new Contexto(new Subtracao());


        System.out.println("Chamando subtração -> " + contexto.executarStrategy(10, 5));

        System.out.println(

        );
        contexto = new Contexto(new Divisao());


        System.out.println("Chamando divisão -> " + contexto.executarStrategy(10, 5));
    }
}
