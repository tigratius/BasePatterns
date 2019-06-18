package main.java.com.tigratius.basepatterns.behavioral.chain;

public class PaymentRunner {
    public static void main(String[] args) {

        PaymentHandler westernUnionPaymentHandler = new WesternUnionPaymentHandler(PaymentType.WU);
        PaymentHandler bankPaymentHandler = new BankPaymentHandler(PaymentType.BANK);
        PaymentHandler moneyPaymentHandler = new MoneyPaymentHandler(PaymentType.BASE);

        westernUnionPaymentHandler.setNextPayment(bankPaymentHandler);
        bankPaymentHandler.setNextPayment(moneyPaymentHandler);

        westernUnionPaymentHandler.HandleRequest(PaymentType.WU);
        System.out.println("------------------------------------------");
        westernUnionPaymentHandler.HandleRequest(PaymentType.BANK);
    }
}
