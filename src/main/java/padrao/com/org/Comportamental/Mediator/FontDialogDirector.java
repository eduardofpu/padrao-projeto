package padrao.com.org.Comportamental.Mediator;


/**Implementação concreta**/
public class FontDialogDirector extends DialogDirector{

    private  ListBox lb;
    private  EntryField ef;


    /**Cria**/
    public void createWidget() {
         lb = new ListBox(this);
         ef = new EntryField(this);

    }

    /**Evento**/
    public void widgetChanged(Widget w) {
        lb.getSelection();
    }

    public EntryField getEf(){
        return ef;
    }

    public static void main(String[] args) {
        FontDialogDirector d = new FontDialogDirector();
        d.createWidget();
        d.getEf().setText(); // Isto aqui quem faz é o usuário com a tela

    }

}
