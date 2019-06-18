package main.java.com.tigratius.basepatterns.behavioral.strategy;

public class Parser  {

    public Parser() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    private Strategy strategy;

    public void execute(String path)
    {
        strategy.Parse(path);
    }
}
