package padrao.com.org.Memento;

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
