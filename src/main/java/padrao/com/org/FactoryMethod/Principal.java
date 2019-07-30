package padrao.com.org.FactoryMethod;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null);

        Mensagem mensagem = new MensagemFactory().getMensagem(2);
        mensagem.enviar(texto);

    }
}
