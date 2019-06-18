package main.java.com.tigratius.basepatterns.creational.builder;

public class Car {
    private String name;
    private String color;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
