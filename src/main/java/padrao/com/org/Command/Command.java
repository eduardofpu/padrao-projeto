package padrao.com.org.Command;

/**Assinaturas da classe **/
public interface Command {
     void execute();
     void undo();
     void pararPortao();
     void acabouAPilha();
}
