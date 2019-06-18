package main.java.com.tigratius.basepatterns.structural.decorator;

public class EmailNotice implements Notice {

    @Override
    public String send() {
        return "Отправляю email оповещение.";
    }
}
