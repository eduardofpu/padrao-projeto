package padrao.com.org.Comportamental.Command;

public class FecharCommand implements Command {

    /**
     * Receive
     **/
    private Portao portao;

    public FecharCommand(Portao portao) {
        this.portao = portao;
    }

    public void execute() {

        portao.fechar();
    }

    public void undo() {
        portao.abrir();
    }

    public void pararPortao() {
        portao.pararPortao();
    }

    public void acabouAPilha() {
        portao.acabouAPilha();
    }

}
