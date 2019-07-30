package padrao.com.org.Estrutural.Bridge;

public class Triangulo extends Forma {

    public Triangulo(Cor c) {
        super(c);
    }

    public void aplicarCor() {
        System.out.println("Triangulo sendo preenchido com a cor");
        cor.aplicarCor();
    }
}
