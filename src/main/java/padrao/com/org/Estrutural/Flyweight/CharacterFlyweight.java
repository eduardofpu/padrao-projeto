package padrao.com.org.Estrutural.Flyweight;

public class CharacterFlyweight extends Flyweight {

    private static int contadorInstancias = 0;
    private char c;

     CharacterFlyweight(char c) {
        this.c = c;
    }

    public void print(String formato) {
        System.out.print(c + formato);
    }

    public static int getContadorInstancias(){
         return contadorInstancias;
    }
}
