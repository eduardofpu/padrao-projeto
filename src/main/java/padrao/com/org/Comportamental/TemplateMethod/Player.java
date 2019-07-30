package padrao.com.org.Comportamental.TemplateMethod;

public abstract class Player {

    public abstract void play();
    public abstract void avancar();
    public abstract void stop();

    public final void executar(){
        play();
        avancar();
        stop();

    }
}
