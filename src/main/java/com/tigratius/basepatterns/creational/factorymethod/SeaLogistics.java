package main.java.com.tigratius.basepatterns.creational.factorymethod;

public class SeaLogistics implements Logistics{

    @Override
    public Transport CreateTransport() {
        return new Ship();
    }
}
