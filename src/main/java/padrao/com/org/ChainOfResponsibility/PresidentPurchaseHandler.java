package padrao.com.org.ChainOfResponsibility;

public class PresidentPurchaseHandler extends AbstractPurchaseHandler {
    public void handleRequest(PurchaseRequest request) {
        if(request.getAmount() < THREE_HUNDRED){
            System.out.println("President will approve $" + request.getAmount());
        }else {
            System.out.println("Your request for" +request.getAmount());
        }
    }
}
