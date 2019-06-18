package main.java.com.tigratius.basepatterns.structural.composite;

public class Plane implements Transport {

    @Override
    public void deliver() {
            System.out.println("Доставка самолетом...");
    }
}
