package main.java.com.tigratius.basepatterns.behavioral.visitor;

public interface CarElement {
    void accept(CarElementVisitor visitor);
}
