package main.java.com.tigratius.basepatterns.behavioral.interpreter;

public class MultiplyExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public MultiplyExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
