package main.java.com.tigratius.basepatterns.creational.abstractfactory.Mac;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.Button;

public class MacButton implements Button {
    @Override
    public void draw() {
        System.out.println("Рисуем кнопку для mac os...");
    }
}
