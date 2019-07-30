package padrao.com.org.Comportamental.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {

        ManagerPurchaseHandler manager = new ManagerPurchaseHandler();
        DirectorPurchaseHandler director = new DirectorPurchaseHandler();
        PresidentPurchaseHandler president = new PresidentPurchaseHandler();
        manager.setSuccessor(director);
        director.setSuccessor(president);

        manager.handleRequest(new PurchaseRequest(50.0, "General"));
        manager.handleRequest(new PurchaseRequest(150.0, "General"));
        manager.handleRequest(new PurchaseRequest(250.0, "General"));
    }
}
