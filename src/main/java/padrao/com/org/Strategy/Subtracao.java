package padrao.com.org.Strategy;

public class Subtracao implements CalculadoraIF {
    public int operacao(int num1, int num2) {
        return (num1 - num2);
    }
}
