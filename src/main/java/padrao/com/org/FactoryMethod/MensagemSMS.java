package padrao.com.org.FactoryMethod;

import javax.swing.*;

public class MensagemSMS implements Mensagem {

    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null,"SMS: " +mensagem);
    }
}
