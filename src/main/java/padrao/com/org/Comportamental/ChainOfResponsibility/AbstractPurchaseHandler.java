package padrao.com.org.Comportamental.ChainOfResponsibility;

public abstract class AbstractPurchaseHandler {
    protected static final double ONE_HUNDRED = 100.0;
    protected static final double TWO_HUNDRED = 200.0;
    protected static final double THREE_HUNDRED = 300.0;

    protected AbstractPurchaseHandler successor;

    public void setSuccessor(AbstractPurchaseHandler successor){
        this.successor = successor;

    }

    abstract public void handleRequest(PurchaseRequest request);
}
