package main.java.com.tigratius.basepatterns.creational.builder;

public class Director {

    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar()
    {
        builder.CreateCar();
        builder.buildColor();
        builder.buildName();
        builder.buildPrice();

        Car car = builder.getCar();

        return car;
    }
}
