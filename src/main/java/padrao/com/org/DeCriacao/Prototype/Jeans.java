package padrao.com.org.DeCriacao.Prototype;

public class Jeans extends Calca {

    public Jeans(){

        tipo = "Jeans azul";
    }
    @Override
    public void criarModelo() {

        System.out.println("Calça jeans simples sendo criada...");
    }
}
