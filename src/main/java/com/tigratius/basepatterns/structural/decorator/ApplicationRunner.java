package main.java.com.tigratius.basepatterns.structural.decorator;

public class ApplicationRunner {
    public static void main(String[] args) {

        Notice notice = new SlackNotice(new SmsNotice(new EmailNotice()));
        System.out.println(notice.send());
    }
}
