package main.java.com.tigratius.basepatterns.behavioral.visitor;

public class CarElementDoVisitor implements CarElementVisitor {
    @Override
    public void visit(Body body) {
        System.out.println("Передвигаюсь...");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Завожу автомобиль...");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Подкачиваю " + wheel.getName() + " колесо...");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Завожу двигатель...");
    }
}
