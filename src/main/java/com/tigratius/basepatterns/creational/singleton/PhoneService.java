package main.java.com.tigratius.basepatterns.creational.singleton;

public class PhoneService {

    private static PhoneService caller;

    public static synchronized PhoneService getCaller() {

        if (caller == null) {
            caller = new PhoneService();
        }

        return caller;
    }

    private PhoneService() {
    }

    public void call(String phoneNumber) {
        System.out.println("Звоним по номеру " + phoneNumber);
    }
}
