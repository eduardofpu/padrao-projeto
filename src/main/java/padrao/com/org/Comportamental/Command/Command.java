package padrao.com.org.Comportamental.Command;

/**Assinaturas da classe **/
public interface Command {
     void execute();
     void undo();
     void pararPortao();
     void acabouAPilha();
}
