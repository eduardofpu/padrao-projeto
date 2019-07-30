package padrao.com.org.Command;

public class Controle {

    private Command[] commands;
    private Command ultimoComand;

    public Controle(){

    }

    public Controle(Command abrirCommand, Command fecharCommand,
                    Command pararPortao, Command acabouPilha) {

        this.commands = new Command[4];
        commands[0] = abrirCommand;
        commands[1] = fecharCommand;
        commands[2] = pararPortao;
        commands[3] = acabouPilha;
    }

    public void abrirPortao(){
        commands[0].execute();
        ultimoComand = commands[0];
    }

    public void fecharPortao(){
        commands[1].execute();
        ultimoComand = commands[1];
    }

    public void desfazer(){
        ultimoComand.undo();
    }

    public void pararPortao(){
        commands[2].pararPortao();
        ultimoComand = commands[2];
    }

    public void acabouPilha(){
        commands[3].acabouAPilha();
    }
}
