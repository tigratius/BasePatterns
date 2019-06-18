package main.java.com.tigratius.basepatterns.behavioral.chain;

public class MoneyPaymentHandler extends PaymentHandler {

    public MoneyPaymentHandler(PaymentType paymentType) {
        super(paymentType);
    }

    @Override
    protected void doOperation() {
        System.out.println("Получаю наличные...");
    }
}
