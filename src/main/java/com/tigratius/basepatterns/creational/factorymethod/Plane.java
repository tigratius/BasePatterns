package main.java.com.tigratius.basepatterns.creational.factorymethod;

public class Plane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка самолетом...");
    }
}
