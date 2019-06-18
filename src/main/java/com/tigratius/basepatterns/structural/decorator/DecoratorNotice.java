package main.java.com.tigratius.basepatterns.structural.decorator;

public class DecoratorNotice implements Notice {

    Notice notice;

    public DecoratorNotice(Notice notice) {
        this.notice = notice;
    }

    @Override
    public String send() {
        return notice.send();
    }
}
