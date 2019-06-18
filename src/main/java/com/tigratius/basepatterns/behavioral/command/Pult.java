package main.java.com.tigratius.basepatterns.behavioral.command;

public class Pult {

    private Command command;

    public Pult(Command command) {
        this.command = command;
    }

    public void pressButtonOn(){
        command.execute();
    }

    public void pressButtonOff(){
        command.undo();
    }
}
