package main.java.com.tigratius.basepatterns.structural.flyweight;

public class PanelHouse implements House{

    @Override
    public void build() {
        System.out.println("Строим дом из панелей.");
    }
}
