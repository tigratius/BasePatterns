package main.java.com.tigratius.basepatterns.behavioral.mediator;

public class Customer extends Colleague {


    public Customer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение заказчику: " + message);
    }
}
