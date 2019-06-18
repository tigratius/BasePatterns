package main.java.com.tigratius.basepatterns.structural.bridge;

public abstract class Company {

    Transport transport;

    public Company(Transport transport) {
        this.transport = transport;
    }

    public abstract void deliverPackage();
}
