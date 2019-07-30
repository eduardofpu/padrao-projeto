package padrao.com.org.Estrutural.Bridge;

public class Cliente {

    public static void main(String[] args) {

        Forma tri = new Triangulo(new CorVermelha());
        tri.aplicarCor();

        Forma pent = new Pentagono(new CorVermelha());

        pent.aplicarCor();
    }
}
