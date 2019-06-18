package main.java.com.tigratius.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport)
    {
        transports.add(transport);
    }

    public void removeTransport(Transport transport)
    {
        transports.remove(transport);
    }

    public void CreateDelivery()
    {
        System.out.println("Доставка грузов запущена \n");
        for (Transport t:transports
             ) {
            t.deliver();
        }
    }
}
