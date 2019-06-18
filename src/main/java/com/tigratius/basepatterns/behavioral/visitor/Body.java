package main.java.com.tigratius.basepatterns.behavioral.visitor;

public class Body implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
