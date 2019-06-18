package main.java.com.tigratius.basepatterns.structural.composite;

public class Car implements Transport {

    @Override
    public void deliver() {
            System.out.println("Доставка автомобилем...");
    }
}
