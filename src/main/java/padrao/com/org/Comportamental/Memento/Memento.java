package padrao.com.org.Comportamental.Memento;

public class Memento {

    public Memento(String estado) {
        this.estado = estado;
    }

    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
