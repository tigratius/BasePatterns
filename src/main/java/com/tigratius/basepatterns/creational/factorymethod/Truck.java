package main.java.com.tigratius.basepatterns.creational.factorymethod;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Доставка грузовиком...");
    }
}
