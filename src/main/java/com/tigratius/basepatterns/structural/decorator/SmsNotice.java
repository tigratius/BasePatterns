package main.java.com.tigratius.basepatterns.structural.decorator;

public class SmsNotice extends DecoratorNotice {

    public SmsNotice(Notice notice) {
        super(notice);
    }

    public String sendSms()
    {
        return "Отправка сообщения по смс.";
    }

    @Override
    public String send() {
        return super.send() + sendSms();
    }
}
