package main.java.com.tigratius.basepatterns.behavioral.strategy;

public class ParsingRunner {

    public static void main(String[] args) {

        Parser parser = new Parser();
        parser.setStrategy(new ExcelParse());
        parser.execute("1.xls");

        parser.setStrategy(new WordParse());
        parser.execute("2.doc");
    }
}
