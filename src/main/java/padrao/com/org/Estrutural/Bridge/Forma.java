package padrao.com.org.Estrutural.Bridge;

public abstract class Forma {
    //composição
    protected Cor cor;

    //construtor com o implementador como argumento
    public Forma(Cor c){
        this.cor = c;
    }

    abstract public void aplicarCor();
}
