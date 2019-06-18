package main.java.com.tigratius.basepatterns.behavioral.chain;

public class WesternUnionPaymentHandler extends PaymentHandler {
    public WesternUnionPaymentHandler(PaymentType paymentType) {
        super(paymentType);
    }

    @Override
    protected void doOperation() {
        System.out.println("Перевожу деньги через WU...");
    }
}
