package padrao.com.org.Comportamental.Strategy;

public class Contexto {
    private CalculadoraIF strategy;

    public Contexto(CalculadoraIF strategy) {
        this.strategy = strategy;
    }

    public int executarStrategy(int num1, int num2){
        return strategy.operacao(num1, num2);
    }
}
