package main.java.com.tigratius.basepatterns.behavioral.mediator;

public class ManagerRunner {
    public static void main(String[] args) {

        ManagerMediator mediator = new ManagerMediator();
        Colleague customer = new Customer(mediator);
        Colleague programmer = new Programmer(mediator);
        Colleague tester = new Tester(mediator);

        mediator.setCustomer(customer);
        mediator.setProgrammer(programmer);
        mediator.setTester(tester);

        customer.send("Нужно сделать программу");
        programmer.send("Программа готова, нужно протестировать");
        tester.send("Программа протестирована и готова к продаже");
    }
}
