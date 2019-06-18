package main.java.com.tigratius.basepatterns.creational.abstractfactory.Mac;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.DropDownList;

public class MacDropDownList implements DropDownList {
    @Override
    public void draw() {
        System.out.println("Рисуем выпадающий список для mac os...");
    }
}
