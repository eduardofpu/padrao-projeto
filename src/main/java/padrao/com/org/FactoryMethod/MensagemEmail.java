package padrao.com.org.FactoryMethod;

import javax.swing.*;

public class MensagemEmail implements Mensagem {

    public void enviar(String mensagem) {

            JOptionPane.showMessageDialog(null,"EMAIL: " +mensagem);

    }
}
