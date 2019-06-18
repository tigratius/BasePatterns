package main.java.com.tigratius.basepatterns.behavioral.observer;

public interface Observed {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
