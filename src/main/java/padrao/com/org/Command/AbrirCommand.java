package padrao.com.org.Command;

public class AbrirCommand implements Command {

    /**Receive**/
    private Portao portao;

    public AbrirCommand(Portao portao) {
        this.portao = portao;
    }

    public void execute() {
        portao.abrir();
    }

    public void undo() {

        portao.fechar();
    }

    public void pararPortao() {
        portao.pararPortao();
    }

    public void acabouAPilha() {
        portao.acabouAPilha();
    }

}
