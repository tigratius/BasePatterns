package main.java.com.tigratius.basepatterns.creational.factorymethod;

public class AirLogistics implements Logistics{

    @Override
    public Transport CreateTransport() {
        return new Plane();
    }
}
