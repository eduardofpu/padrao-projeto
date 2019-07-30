package padrao.com.org.Comportamental.Memento;

public class Originator {

    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Memento salvarEstadoMemento(){
        return new Memento(estado);
    }

    public void getEstadoSalvoMemento(Memento ultimoEstado){
        estado = ultimoEstado.getEstado();
    }
}
