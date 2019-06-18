package main.java.com.tigratius.basepatterns.creational.abstractfactory.Windows;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.Menu;

public class WinMenu implements Menu {
    @Override
    public void draw() {
        System.out.println("Рисуем меню для windows...");
    }
}
