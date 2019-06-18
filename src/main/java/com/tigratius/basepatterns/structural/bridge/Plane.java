package main.java.com.tigratius.basepatterns.structural.bridge;

public class Plane implements Transport {

    @Override
    public void deliver() {
            System.out.println("Доставка самолетом...");
    }
}
