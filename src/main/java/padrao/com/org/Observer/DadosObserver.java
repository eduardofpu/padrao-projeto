package padrao.com.org.Observer;

public class DadosObserver extends Observer{

    public DadosObserver(SujeitoAtualizar sujeito){
        this.subject = sujeito;
        this.subject.addObserver(this);
    }
    public void atualizarDados() {

        System.out.println("Atualizando dados apartir do observer...");
    }
}
