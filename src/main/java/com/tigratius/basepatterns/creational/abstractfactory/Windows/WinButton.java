package main.java.com.tigratius.basepatterns.creational.abstractfactory.Windows;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.Button;

public class WinButton implements Button {
    @Override
    public void draw() {
        System.out.println("Рисуем кнопку для windows...");
    }
}
