package padrao.com.org.Observer;

import java.util.ArrayList;

/**classe concreta**/
public class SujeitoAtualizar {

    public ArrayList<Observer> listaObservadores = new ArrayList<Observer>();

    public void setNotificacao() {
        notificarObservadores();
    }

    public void addObserver(Observer observer) {
        this.listaObservadores.add(observer);
    }


    public void notificarObservadores() {
        for (Observer observer : listaObservadores) {
            observer.atualizarDados();
        }
    }
}
