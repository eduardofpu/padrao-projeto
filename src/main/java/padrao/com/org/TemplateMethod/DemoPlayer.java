package padrao.com.org.TemplateMethod;

public class DemoPlayer {
    public static void main(String[] args) {

        Player tocador = new Mp3Player();
        tocador.executar();

        System.out.println();

        tocador = new WmvPlayer();
        tocador.executar();
    }
}
