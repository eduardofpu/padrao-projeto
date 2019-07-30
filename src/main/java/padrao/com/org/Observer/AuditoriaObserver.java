package padrao.com.org.Observer;

public class AuditoriaObserver extends Observer {

    public AuditoriaObserver(SujeitoAtualizar sujeito){
        this.subject = sujeito;
        this.subject.addObserver(this);
    }
    public void atualizarDados() {
        System.out.println("Atualizando auditoria apartir do observer...");
    }
}
