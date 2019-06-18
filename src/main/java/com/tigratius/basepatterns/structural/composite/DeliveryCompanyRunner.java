package main.java.com.tigratius.basepatterns.structural.composite;


public class DeliveryCompanyRunner {

    public static void main(String[] args) {
        Company company = new Company();

        Transport car = new Car();
        Transport plane = new Plane();

        company.addTransport(car);
        company.addTransport(plane);

        company.CreateDelivery();
    }
}
