package padrao.com.org.TemplateMethod;

public class Mp3Player extends Player {
    public void play() {
        System.out.println("Executando uma música MP3...");
    }

    public void avancar() {
        System.out.println("Parando música MP3");
    }

    public void stop() {
        System.out.println("Avançando música MP3");
    }

}
