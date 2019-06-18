package main.java.com.tigratius.basepatterns.behavioral.chain;

public abstract class PaymentHandler {

    private PaymentHandler nextPaymentHandler;
    private PaymentType paymentType;

    public PaymentHandler(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    protected void setNextPayment(PaymentHandler paymentHandler) {
        this.nextPaymentHandler = paymentHandler;
    }

    protected void HandleRequest(PaymentType paymentType)
    {
        if (this.paymentType.ordinal() >= paymentType.ordinal())
        {
            doOperation();
        }

        if (nextPaymentHandler != null)
        {
            nextPaymentHandler.HandleRequest(paymentType);
        }
    }

    protected abstract void doOperation();
}
