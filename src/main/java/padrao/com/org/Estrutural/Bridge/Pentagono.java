package padrao.com.org.Estrutural.Bridge;

public class Pentagono extends Forma {
    public Pentagono(Cor c) {
        super(c);
    }

    public void aplicarCor() {
        System.out.println("Pentagono sendo preenchido com a cor");
        cor.aplicarCor();
    }
}
