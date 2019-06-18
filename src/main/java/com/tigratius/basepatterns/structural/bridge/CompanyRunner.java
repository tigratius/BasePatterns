package main.java.com.tigratius.basepatterns.structural.bridge;

public class CompanyRunner {
    public static void main(String[] args) {

        /*Company airCompany = new AirCompany(new Plane());
        airCompany.deliverPackage();

        Company landCompany = new LandCompany(new Car());
        landCompany.deliverPackage();*/

        Company[] companies = {new AirCompany(new Plane()), new LandCompany(new Car())};

        for (Company company:companies
             ) {
            company.deliverPackage();
        }
    }
}
