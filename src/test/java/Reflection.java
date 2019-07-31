import padrao.com.org.Comportamental.Visitor.Salgados;

import java.lang.reflect.Field;

public class Reflection {

    public static void main(String[] args) {
        print();
        listAtributo();
    }

    public static String getAtributo(){
        String name = null;
        Class<Salgados> classe = Salgados.class;
        for (Field atributo : classe.getDeclaredFields()){
            if(atributo.getName().equals("valorCongelado")) {
                name = atributo.getName();
                return name;
            }
        }

       return "Error";
    }

    public static void listAtributo(){
        String name = null;
        Class<Salgados> classe = Salgados.class;
        for (Field atributo : classe.getDeclaredFields()){
            System.out.println(atributo.getName());
        }
    }

    public static void print(){
        System.out.println(getAtributo());
    }
}
