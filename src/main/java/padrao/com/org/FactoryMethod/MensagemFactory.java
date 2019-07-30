package padrao.com.org.FactoryMethod;

public class MensagemFactory {


    /** As subclasse delega qual classe ira representar o objeto**/
    public static Mensagem getMensagem(int i){
        if(i == 1){
            return new MensagemSMS();
        }else if(i == 2){
            return  new MensagemEmail();
        }else {
            return null;
        }
    }
}
