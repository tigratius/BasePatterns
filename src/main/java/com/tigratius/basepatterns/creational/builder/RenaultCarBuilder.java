package main.java.com.tigratius.basepatterns.creational.builder;

public class RenaultCarBuilder extends CarBuilder {
    @Override
    void buildColor() {
        car.setColor("Blue");
    }

    @Override
    void buildPrice() {
        car.setPrice(20000);
    }

    @Override
    void buildName() {
        car.setName("Renault");
    }
}
