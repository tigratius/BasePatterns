package main.java.com.tigratius.basepatterns.behavioral.mediator;

public interface Mediator {

    void send(String msg, Colleague colleague);
}
