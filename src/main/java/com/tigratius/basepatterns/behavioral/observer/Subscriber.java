package main.java.com.tigratius.basepatterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> orders) {

        System.out.println("*********************************");
        System.out.println(name + "! Пришел новый заказ:");

        for (String order:orders
             ) {
            System.out.println(order);
        }
        System.out.println("*********************************");
    }
}
