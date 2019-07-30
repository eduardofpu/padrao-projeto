package padrao.com.org.Estrutural.Proxy;

/**classe concreta ou seja classe final**/
public class TipoRealAudio implements AudioIF{

    private TipoRealAudio meuAudio;
    private String nomeArquivo;

    public TipoRealAudio(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregandoArquivo(nomeArquivo);
    }

    public void play() {
            System.out.println("Tocando o arquivo de nome" + nomeArquivo);
    }

    public void carregandoArquivo(String nomeArquivo){
        System.out.println("Carregando arquivo" + nomeArquivo+"  do disco.");
    }
}
