package main.java.com.tigratius.basepatterns.creational.builder;

public abstract class CarBuilder {

    Car car;

    void CreateCar()
    {
        car = new Car();
    }

    abstract void buildColor();
    abstract void buildPrice();
    abstract void buildName();

    public Car getCar() {
        return car;
    }
}
