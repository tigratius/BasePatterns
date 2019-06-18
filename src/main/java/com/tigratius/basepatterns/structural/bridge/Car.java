package main.java.com.tigratius.basepatterns.structural.bridge;

public class Car implements Transport {

    @Override
    public void deliver() {
            System.out.println("Доставка автомобилем...");
    }
}
