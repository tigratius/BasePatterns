package main.java.com.tigratius.basepatterns.behavioral.strategy;

public class WordParse implements Strategy {

    @Override
    public void Parse(String path) {
        System.out.println("Парсим word файл: " + path);
    }
}
