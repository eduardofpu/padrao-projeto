package padrao.com.org.DeCriacao.FactoryMethod;

import padrao.com.org.DeCriacao.FactoryMethod.Mensagem;

import javax.swing.*;

public class MensagemSMS implements Mensagem {

    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null,"SMS: " +mensagem);
    }
}
