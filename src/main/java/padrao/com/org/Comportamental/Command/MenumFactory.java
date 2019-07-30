package padrao.com.org.Comportamental.Command;

public class MenumFactory {

    static Portao portao = new Portao();
    static Command abrirCommand = new AbrirCommand(portao);
    static Command fecharCommand = new FecharCommand(portao);

    static Command pararPortao = new AbrirCommand(portao);
    static Command acabouPilha = new FecharCommand(portao);

    static Controle controle = new Controle(abrirCommand, fecharCommand, pararPortao, acabouPilha);

    /**delegando os métodos**/
    public static void getClick(int i){

        if(i == 0){
            controle.abrirPortao();
        }else if(i == 1){
            controle.fecharPortao();
        }else if(i == 2){
            controle.pararPortao();
        }else{
            controle.acabouPilha();
        }
    }
}
