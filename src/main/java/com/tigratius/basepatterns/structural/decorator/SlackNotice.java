package main.java.com.tigratius.basepatterns.structural.decorator;

public class SlackNotice extends DecoratorNotice{

    public SlackNotice(Notice notice) {
        super(notice);
    }

    public String sendSlackMes()
    {
        return "Отправка сообщения в Slack.";
    }

    @Override
    public String send() {
        return super.send()+ sendSlackMes();
    }
}
