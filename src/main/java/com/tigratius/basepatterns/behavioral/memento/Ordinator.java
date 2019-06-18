package main.java.com.tigratius.basepatterns.behavioral.memento;

import java.util.Date;

public class Ordinator {

    public void setNameAndDate(String name) {
        this.name = name;
        this.date = new Date();
    }

    private String name;
    private Date date;

    public Memento save()
    {
        return new Memento(name);
    }

    public void restore(Memento memento)
    {
        name = memento.getName();
        date = memento.getDate();
    }

    @Override
    public String toString() {
        return "Ordinator{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
