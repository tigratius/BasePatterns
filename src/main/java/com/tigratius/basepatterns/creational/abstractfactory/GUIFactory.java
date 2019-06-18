package main.java.com.tigratius.basepatterns.creational.abstractfactory;

public interface GUIFactory {
    Button getButton();
    Menu getMenu();
    DropDownList getDropDownList();
}
