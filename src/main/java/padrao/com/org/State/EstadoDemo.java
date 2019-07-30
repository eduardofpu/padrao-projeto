package padrao.com.org.State;

public class EstadoDemo {

    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        EstadoInicial estadoInicial = new EstadoInicial();
        estadoInicial.fazerAcao(contexto);

        EstadoPausado estadoPausado = new EstadoPausado();
        estadoPausado.fazerAcao(contexto);
    }
}
