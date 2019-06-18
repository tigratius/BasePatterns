package main.java.com.tigratius.basepatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        PhoneService.getCaller().call("555-55-55");
        PhoneService.getCaller().call("777-77-77");
    }
}
