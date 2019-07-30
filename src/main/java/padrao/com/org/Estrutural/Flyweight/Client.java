package padrao.com.org.Estrutural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<CharacterFlyweight> textoEmMemoria = new ArrayList<CharacterFlyweight>();

        String texto = "este é um texto onde as letras repetem";
        System.out.println("Tamanho do texto " + texto.length());

        for(char c : texto.toCharArray()){

            textoEmMemoria.add(CharFactory.getFlyweight(c));
        }

        for(CharacterFlyweight characterFlyweight : textoEmMemoria){

            characterFlyweight.print("|");
        }

        System.out.println();
        System.out.println("Quantidade de instâncias = " + CharacterFlyweight.getContadorInstancias());
    }
}
