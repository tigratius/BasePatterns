package main.java.com.tigratius.basepatterns.creational.abstractfactory.Mac;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.Button;
import main.java.com.tigratius.basepatterns.creational.abstractfactory.DropDownList;
import main.java.com.tigratius.basepatterns.creational.abstractfactory.GUIFactory;
import main.java.com.tigratius.basepatterns.creational.abstractfactory.Menu;

public class MacFactory implements GUIFactory {

    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Menu getMenu() {
        return new MacMenu();
    }

    @Override
    public DropDownList getDropDownList() {
        return new MacDropDownList();
    }
}
