package main.java.com.tigratius.basepatterns.behavioral.memento;

public class Caretaker {
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    private Memento memento;
}
