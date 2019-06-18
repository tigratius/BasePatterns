package main.java.com.tigratius.basepatterns.behavioral.iterator;

public class CarRunner {
    public static void main(String[] args) {

        String[] upgrades = {"disks", "light", "music"};
        Car car = new Car("Suzuki", upgrades);

        Iterator iterator = car.getIterator();

        System.out.println("Car: " + car.getName());

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
