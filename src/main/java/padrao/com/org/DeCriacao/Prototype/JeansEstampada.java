package padrao.com.org.DeCriacao.Prototype;

public class JeansEstampada extends Calca{

    public JeansEstampada(){
        tipo = "Jeans estampada";
    }

    @Override
    public void criarModelo() {
        System.out.println("Calça jeans estampada sendo criada...");
    }
}
