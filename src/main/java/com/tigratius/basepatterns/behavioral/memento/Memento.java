package main.java.com.tigratius.basepatterns.behavioral.memento;

import java.util.Date;

public class Memento {

    private final String name;
    private final Date date;

    public Memento(String name) {
        this.name = name;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
