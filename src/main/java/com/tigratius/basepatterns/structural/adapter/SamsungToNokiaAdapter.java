package main.java.com.tigratius.basepatterns.structural.adapter;

public class SamsungToNokiaAdapter extends SamsungCharger implements NokiaCharger{

    @Override
    public void chargementNokia() {
        charge();
    }
}
