package main.java.com.tigratius.basepatterns.behavioral.template;

public abstract class WebsiteTemplate {

    public void showPage()
    {
        System.out.println("***************************");
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
        System.out.println("***************************");
    }

    public abstract void showPageContent();
}
