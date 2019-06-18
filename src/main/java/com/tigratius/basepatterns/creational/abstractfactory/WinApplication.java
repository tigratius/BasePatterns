package main.java.com.tigratius.basepatterns.creational.abstractfactory;

import main.java.com.tigratius.basepatterns.creational.abstractfactory.Windows.WinFactory;

public class WinApplication {
    public static void main(String[] args) {
        WinFactory winFactory = new WinFactory();
        Button button = winFactory.getButton();
        DropDownList dropDownList = winFactory.getDropDownList();
        Menu menu = winFactory.getMenu();

        button.draw();
        dropDownList.draw();
        menu.draw();
    }
}
