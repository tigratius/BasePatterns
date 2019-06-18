package main.java.com.tigratius.basepatterns.behavioral.memento;

public class ApplicationRunner {
    public static void main(String[] args) {
        Ordinator ordinator = new Ordinator();
        Caretaker caretaker = new Caretaker();

        System.out.println("Creating...");
        ordinator.setNameAndDate("test");
        System.out.println(ordinator);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Saving...");
        caretaker.setMemento(ordinator.save());

        System.out.println("Updating...");
        ordinator.setNameAndDate("test1");
        System.out.println(ordinator);

        System.out.println("Restore...");
        ordinator.restore(caretaker.getMemento());
        System.out.println(ordinator);
    }
}
