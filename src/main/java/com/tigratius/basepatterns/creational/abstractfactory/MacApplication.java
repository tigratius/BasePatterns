package main.java.com.tigratius.basepatterns.creational.abstractfactory;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.Mac.MacFactory;

public class MacApplication {
    public static void main(String[] args) {
        MacFactory macFactory = new MacFactory();
        Button button = macFactory.getButton();
        DropDownList dropDownList = macFactory.getDropDownList();
        Menu menu = macFactory.getMenu();

        button.draw();
        dropDownList.draw();
        menu.draw();
    }
}
