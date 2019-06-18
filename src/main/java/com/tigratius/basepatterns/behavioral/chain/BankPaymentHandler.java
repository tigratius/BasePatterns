package main.java.com.tigratius.basepatterns.behavioral.chain;

public class BankPaymentHandler extends PaymentHandler {
    public BankPaymentHandler(PaymentType paymentType) {
        super(paymentType);
    }

    @Override
    protected void doOperation() {
        System.out.println("Банковская операция...");
    }
}
