package main.java.com.tigratius.basepatterns.creational.factorymethod;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Доставка кораблем...");
    }
}
