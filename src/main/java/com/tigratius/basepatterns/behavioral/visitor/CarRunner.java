package main.java.com.tigratius.basepatterns.behavioral.visitor;

public class CarRunner {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("*******************************");
        car.accept(new CarElementPrintVisitor());
        System.out.println("*******************************");
        car.accept(new CarElementDoVisitor());
        System.out.println("*******************************");
    }
}
