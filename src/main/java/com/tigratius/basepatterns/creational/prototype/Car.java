package main.java.com.tigratius.basepatterns.creational.prototype;

public class Car implements Copyable{

    private String name;
    private String color;
    private int price;

    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public Object copy() {
        Car copy = new Car(name, color, price);
        return copy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
