package padrao.com.org.State;

public class EstadoInicial implements EstadoIF {
    public void fazerAcao(Contexto contexto) {

        System.out.println("O filme esta no estado inicial....");
        contexto.setEstado(this);
    }
}
