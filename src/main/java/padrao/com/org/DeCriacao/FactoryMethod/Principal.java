package padrao.com.org.DeCriacao.FactoryMethod;

import padrao.com.org.DeCriacao.FactoryMethod.Mensagem;
import padrao.com.org.DeCriacao.FactoryMethod.MensagemFactory;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null);

        Mensagem mensagem = new MensagemFactory().getMensagem(2);
        mensagem.enviar(texto);

    }
}
