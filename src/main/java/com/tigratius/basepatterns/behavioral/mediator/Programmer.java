package main.java.com.tigratius.basepatterns.behavioral.mediator;

public class Programmer extends Colleague {


    public Programmer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение программисту: " + message);
    }
}
