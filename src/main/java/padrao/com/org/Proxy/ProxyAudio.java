package padrao.com.org.Proxy;

public class ProxyAudio implements AudioIF{
    private TipoRealAudio meuAudio;
    private String nomeArquivo;

    public ProxyAudio(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    /** metodo singleton**/
    public void play() {

        if(meuAudio == null){
            System.out.println("Instância não existia....Criando instância de TipoRealAudio...");
            meuAudio = new TipoRealAudio(nomeArquivo);

        }else {
            System.out.println("Recuperando instância anteriormente criada de TipoRealAudio");

        }

        meuAudio.play();

    }
}
