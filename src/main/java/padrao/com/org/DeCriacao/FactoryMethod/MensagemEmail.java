package padrao.com.org.DeCriacao.FactoryMethod;

import padrao.com.org.DeCriacao.FactoryMethod.Mensagem;

import javax.swing.*;

public class MensagemEmail implements Mensagem {

    public void enviar(String mensagem) {

            JOptionPane.showMessageDialog(null,"EMAIL: " +mensagem);

    }
}
