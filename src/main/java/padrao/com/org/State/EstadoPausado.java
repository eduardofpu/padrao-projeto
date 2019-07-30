package padrao.com.org.State;

public class EstadoPausado implements EstadoIF {
    public void fazerAcao(Contexto contexto) {
        System.out.println("O filme esta pausado....");
        contexto.setEstado(this);
    }
}
