package padrao.com.org.Comportamental.Command;

public class Portao {

    public final static int ABERTO = 0;
    public final static int FECHADO = 1;
    public final static int PARAR = 2;
    public final static int ACABOU_A_PILHA = 3;

    private int estado = 0;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void abrir() {
        this.estado = ABERTO;
        System.out.println("O portao abriu");
    }

    public void fechar() {
        this.estado = FECHADO;
        System.out.println("O portao fechou.");
    }

    public void pararPortao() {
        this.estado = PARAR;
        System.out.println("O portao parou.");
    }

    public void acabouAPilha() {
        this.estado = ACABOU_A_PILHA;
        System.out.println("Acabou a pilha");
    }
}
