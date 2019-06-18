package main.java.com.tigratius.basepatterns.structural.facade;

public class ApplicationRunner {
    public static void main(String[] args) {

        VisualStudioFacade facade = new VisualStudioFacade();
        facade.start();
        System.out.println("\n========================================\n");
        facade.stop();
    }
}
