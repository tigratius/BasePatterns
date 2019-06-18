package main.java.com.tigratius.basepatterns.behavioral.visitor;

public interface CarElementVisitor {

    void visit(Body body);
    void visit(Wheel wheel);
    void visit(Car car);
    void visit(Engine engine);

}
