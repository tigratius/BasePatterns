package main.java.com.tigratius.basepatterns.behavioral.observer;

public class RestaurantOrdering {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Subscriber cook = new Subscriber("Повар");
        Subscriber waiter = new Subscriber("Официант");

        restaurant.addOrder("order1");
        restaurant.addOrder("order2");

        restaurant.addObserver(cook);
        restaurant.addObserver(waiter);

        restaurant.addOrder("order3");
    }
}
