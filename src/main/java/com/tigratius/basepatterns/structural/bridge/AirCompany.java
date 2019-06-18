package main.java.com.tigratius.basepatterns.structural.bridge;

public class AirCompany extends Company{

    public AirCompany(Transport transport) {
        super(transport);
    }

    @Override
    public void deliverPackage() {
        System.out.println("Компания авиаперевозок доставляет груз...");
        transport.deliver();
    }
}
