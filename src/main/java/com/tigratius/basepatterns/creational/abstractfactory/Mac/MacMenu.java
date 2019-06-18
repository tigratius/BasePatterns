package main.java.com.tigratius.basepatterns.creational.abstractfactory.Mac;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.Menu;

public class MacMenu implements Menu {
    @Override
    public void draw() {
        System.out.println("Рисуем меню для mac os...");
    }
}
