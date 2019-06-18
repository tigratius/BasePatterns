package main.java.com.tigratius.basepatterns.behavioral.visitor;

public class CarElementPrintVisitor implements CarElementVisitor {
    @Override
    public void visit(Body body) {
        System.out.println("Посещаю кузов...");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Посещаю " + wheel.getName() + " колесо...");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Посещаю авто...");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Посещаю двигатель...");
    }
}
