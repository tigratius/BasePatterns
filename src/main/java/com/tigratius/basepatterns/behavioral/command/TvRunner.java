package main.java.com.tigratius.basepatterns.behavioral.command;

public class TvRunner {
    public static void main(String[] args) {

        Command command = new TvOnCommand(new TV());

        Pult pult = new Pult(command);

        pult.pressButtonOn();
        pult.pressButtonOff();
    }
}
