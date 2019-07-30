package padrao.com.org.Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Cache();
    }

    public static void Cache() {
        CalcaCahe.loadCache();

        Calca calcaClonada = CalcaCahe.getCalca("jeans");
        calcaClonada.criarModelo();
        System.out.println("Calca clonada ->" + calcaClonada.getTipo());


        Calca calcaClonada2 = CalcaCahe.getCalca("estampa");
        calcaClonada2.criarModelo();
        System.out.println("Calca clonada :" + calcaClonada2.getTipo());


        Calca calcaClonada3 = CalcaCahe.getCalca("stretch");
        calcaClonada3.criarModelo();
        System.out.println("Calca clonada  :" + calcaClonada3.getTipo());

    }
}
