package main.java.com.tigratius.basepatterns.creational.factorymethod;

public class RoadLogistics  implements Logistics{

    @Override
    public Transport CreateTransport() {
        return new Truck();
    }
}
