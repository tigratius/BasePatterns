package main.java.com.tigratius.basepatterns.creational.abstractfactory.Windows;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.DropDownList;

public class WinDropDownList implements DropDownList {
    @Override
    public void draw() {
        System.out.println("Рисуем выпадающий список для windows...");
    }
}
