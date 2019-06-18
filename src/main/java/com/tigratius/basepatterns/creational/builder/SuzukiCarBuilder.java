package main.java.com.tigratius.basepatterns.creational.builder;

public class SuzukiCarBuilder extends CarBuilder{

    @Override
    void buildColor() {
        car.setColor("Red");
    }

    @Override
    void buildPrice() {
        car.setPrice(10000);
    }

    @Override
    void buildName() {
        car.setName("Suzuki");
    }
}
