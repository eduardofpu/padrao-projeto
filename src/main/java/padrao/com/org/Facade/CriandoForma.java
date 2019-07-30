package padrao.com.org.Facade;

public class CriandoForma {

    private FormaIF hexagono;
    private FormaIF quadrilatero;

    public CriandoForma() {
        hexagono = new Hexagono();
        quadrilatero = new Quadrilatero();
    }

    public void criarHexagono() {
        hexagono.desenhar();
    }

    public void criaQuadrilatero() {
        quadrilatero.desenhar();
    }
}
