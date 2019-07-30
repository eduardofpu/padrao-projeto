package padrao.com.org.DeCriacao.Singleton;

public class GerenciadorImpressao {

    private static GerenciadorImpressao gerenciadorImpressao;

    private GerenciadorImpressao(){

    }

    /**PRECISA RETORNAR O MESMO ENDEREÇO DE MEMÓRIA PARA TODOS OS OBJETOS**/
    public static GerenciadorImpressao getInstance(){
        if(gerenciadorImpressao == null){
            gerenciadorImpressao = new GerenciadorImpressao();
        }
        return gerenciadorImpressao;
    }
}
