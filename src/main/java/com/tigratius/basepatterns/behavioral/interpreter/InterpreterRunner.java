package main.java.com.tigratius.basepatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {

        Context context = new Context();

        int x = 15;
        int y = 9;
        int z = 2;

        context.setVariable("x", x);
        context.setVariable("y", y);
        context.setVariable("z", z);

        Expression expression = new DivExpression(
                new MultiplyExpression(
                        new NumberExpression("x"), new NumberExpression("y")
                ),
                new NumberExpression("z")
        );

        double result = expression.interpret(context);
        System.out.println("результат: " + result);
    }
}
