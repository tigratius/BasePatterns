package main.java.com.tigratius.basepatterns.creational.builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SuzukiCarBuilder());

        Car car = director.buildCar();
        System.out.println(car.toString());

        director.setBuilder(new RenaultCarBuilder());
        car = director.buildCar();
        System.out.println(car.toString());
    }
}
