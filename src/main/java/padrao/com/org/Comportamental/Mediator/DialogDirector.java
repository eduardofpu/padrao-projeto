package padrao.com.org.Comportamental.Mediator;

public abstract class DialogDirector {

    public void showDialog(){

    }

    public abstract void createWidget();
    public abstract void widgetChanged(Widget widget);
}
