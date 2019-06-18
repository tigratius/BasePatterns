package main.java.com.tigratius.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Observed {

    private List<String> orders = new ArrayList<>();
    private List<Observer>  observers = new ArrayList<>();

    public void addOrder(String name) {
        orders.add(name);
        notifyObservers();
    }

    public void removeOrder(String name) {
        orders.remove(name);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for (Observer o:observers
             ) {
            o.update(this.orders);
        }
    }
}
