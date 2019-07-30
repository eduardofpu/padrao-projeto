package padrao.com.org.Comportamental.Command;

public class Principal {

    public static void main(String[] args) {
        Portao portao = new Portao();
        Command abrirCommand = new AbrirCommand(portao);
        Command fecharCommand = new FecharCommand(portao);

        Command pararPortao = new AbrirCommand(portao);
        Command acabouPilha = new FecharCommand(portao);

        Controle controle = new Controle(abrirCommand, fecharCommand, pararPortao, acabouPilha);
        controle.abrirPortao();
        controle.pararPortao();
        controle.fecharPortao();
        controle.desfazer();
        controle.fecharPortao();
        controle.abrirPortao();
        controle.desfazer();
        controle.acabouPilha();
    }
}
