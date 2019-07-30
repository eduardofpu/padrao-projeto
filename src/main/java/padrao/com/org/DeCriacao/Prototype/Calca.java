package padrao.com.org.DeCriacao.Prototype;

public abstract class Calca implements Cloneable{

    private String id;
    protected String tipo;

    /**O metodo ira variar**/
    public abstract void criarModelo();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
