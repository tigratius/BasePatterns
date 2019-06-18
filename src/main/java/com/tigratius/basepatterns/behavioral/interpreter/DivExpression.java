package main.java.com.tigratius.basepatterns.behavioral.interpreter;

public class DivExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public DivExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double interpret(Context context) {
        return leftExpression.interpret(context) / rightExpression.interpret(context);
    }
}
