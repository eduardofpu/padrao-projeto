package padrao.com.org.Prototype;

public class JeansStretch extends Calca {

    public JeansStretch(){

        tipo = "Jeans stretch";
    }

    @Override
    public void criarModelo() {

        System.out.println("Calça jeans stretch sendo criada...");
    }
}
