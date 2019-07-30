package padrao.com.org.Comportamental.ChainOfResponsibility;

public class PurchaseRequest {

      private double amount;
      private String general;

    public PurchaseRequest(double amount, String general) {
        this.amount = amount;
        this.general = general;
    }

    public double getAmount() {
        return amount;
    }

    public String getGeneral() {
        return general;
    }
}
