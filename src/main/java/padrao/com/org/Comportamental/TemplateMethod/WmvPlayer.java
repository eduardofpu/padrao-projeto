package padrao.com.org.Comportamental.TemplateMethod;

public class WmvPlayer extends Player {
    public void play() {
        System.out.println("Executando uma música WMV...");
    }

    public void avancar() {
        System.out.println("Avançando uma música WMV...");
    }

    public void stop() {
        System.out.println("Parando uma música WMV...");
    }
}
