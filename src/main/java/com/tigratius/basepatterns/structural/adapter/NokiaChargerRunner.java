package main.java.com.tigratius.basepatterns.structural.adapter;

public class NokiaChargerRunner {

    public static void main(String[] args) {
        NokiaCharger nokiaCharger = new SamsungToNokiaAdapter();
        nokiaCharger.chargementNokia();
    }
}
