package padrao.com.org.Comportamental.ChainOfResponsibility;

public class ManagerPurchaseHandler extends AbstractPurchaseHandler {
    public void handleRequest(PurchaseRequest request) {
        if(request.getAmount() < ONE_HUNDRED){
            System.out.println("Manager will approve $" + request.getAmount());
        }else {
            successor.handleRequest(request);
        }
    }
}
