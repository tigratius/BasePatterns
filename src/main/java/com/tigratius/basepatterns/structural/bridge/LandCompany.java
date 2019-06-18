package main.java.com.tigratius.basepatterns.structural.bridge;

public class LandCompany extends Company{

    public LandCompany(Transport transport) {
        super(transport);
    }

    @Override
    public void deliverPackage() {
        System.out.println("Компания наземных перевозок доставляет груз...");
        transport.deliver();
    }
}
