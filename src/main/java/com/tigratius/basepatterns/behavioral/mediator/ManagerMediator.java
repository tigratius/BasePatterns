package main.java.com.tigratius.basepatterns.behavioral.mediator;

public class ManagerMediator implements Mediator {

    public Colleague getCustomer() {
        return customer;
    }

    public void setCustomer(Colleague customer) {
        this.customer = customer;
    }

    public Colleague getProgrammer() {
        return programmer;
    }

    public void setProgrammer(Colleague programmer) {
        this.programmer = programmer;
    }

    public Colleague getTester() {
        return tester;
    }

    public void setTester(Colleague tester) {
        this.tester = tester;
    }

    private Colleague customer;
    private Colleague programmer;
    private Colleague tester;

    @Override
    public void send(String msg, Colleague colleague) {
        if (customer == colleague)
        {
            programmer.notify(msg);
        }
        else if (colleague == programmer)
        {
            tester.notify(msg);
        }else if (colleague == tester)
        {
            customer.notify(msg);
        }
    }
}
