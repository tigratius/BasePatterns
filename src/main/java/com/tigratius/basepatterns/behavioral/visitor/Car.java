package main.java.com.tigratius.basepatterns.behavioral.visitor;

public class Car implements CarElement {

    private CarElement[] elements;

    public Car() {
        elements = new CarElement[]{
          new Wheel("левое переднее"),
          new Wheel("левое заднее"),
          new Wheel("правое переднее"),
          new Wheel("правое заднее"),
          new Body(),
          new Engine()
        };
    }

    @Override
    public void accept(CarElementVisitor visitor) {

        for (CarElement element:elements
             ) {
            element.accept(visitor);
        }

        visitor.visit(this);
    }
}
