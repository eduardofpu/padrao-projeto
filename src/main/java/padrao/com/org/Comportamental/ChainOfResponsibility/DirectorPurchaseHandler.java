package padrao.com.org.Comportamental.ChainOfResponsibility;

public class DirectorPurchaseHandler extends AbstractPurchaseHandler{
    public void handleRequest(PurchaseRequest request) {
        if(request.getAmount() < TWO_HUNDRED){
            System.out.println("Director will approve $" + request.getAmount());
        }else {
            successor.handleRequest(request);
        }
    }
}
