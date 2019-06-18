package main.java.com.tigratius.basepatterns.behavioral.template;

public class WebsiteRunner {

    public static void main(String[] args) {
        WebsiteTemplate newsWebsite = new NewsWebsite();
        WebsiteTemplate jobWebsite = new JobSearchWebsite();
        newsWebsite.showPage();
        jobWebsite.showPage();
    }
}
