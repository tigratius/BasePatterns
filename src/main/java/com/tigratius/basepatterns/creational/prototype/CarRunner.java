package main.java.com.tigratius.basepatterns.creational.prototype;

public class CarRunner {

    public static void main(String[] args) {
        Car car = new Car("Suzuki", "Red", 10000);
        System.out.println(car);

        CarFactory factory = new CarFactory(car);
        Car carClone = factory.cloneCar();
        System.out.println("\n=============================\n");
        System.out.println(carClone.toString());
    }
}
