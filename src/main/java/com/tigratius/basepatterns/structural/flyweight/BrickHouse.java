package main.java.com.tigratius.basepatterns.structural.flyweight;

public class BrickHouse implements House {
    @Override
    public void build() {
        System.out.println("Строим дом из кирпича.");
    }
}
