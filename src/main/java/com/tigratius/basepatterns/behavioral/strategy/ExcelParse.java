package main.java.com.tigratius.basepatterns.behavioral.strategy;

public class ExcelParse implements Strategy {
    @Override
    public void Parse(String path) {
        System.out.println("Парсим excel файл: " + path);
    }
}
