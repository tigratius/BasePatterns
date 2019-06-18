package main.java.com.tigratius.basepatterns.behavioral.mediator;

public class Tester extends Colleague {


    public Tester(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение тестеру: " + message);
    }
}
