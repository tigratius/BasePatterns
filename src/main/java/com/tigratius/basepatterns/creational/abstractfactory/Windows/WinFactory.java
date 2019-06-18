package main.java.com.tigratius.basepatterns.creational.abstractfactory.Windows;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.Button;
import main.java.com.tigratius.basepatterns.creational.abstractfactory.DropDownList;
import main.java.com.tigratius.basepatterns.creational.abstractfactory.GUIFactory;
import main.java.com.tigratius.basepatterns.creational.abstractfactory.Menu;

public class WinFactory implements GUIFactory {

    @Override
    public Button getButton() {
        return new WinButton();
    }

    @Override
    public Menu getMenu() {
        return new WinMenu();
    }

    @Override
    public DropDownList getDropDownList() {
        return new WinDropDownList();
    }
}
