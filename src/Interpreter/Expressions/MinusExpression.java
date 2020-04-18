package Interpreter.Expressions;

import Interpreter.IValue;

public class MinusExpression implements IValue {
    private IValue firstValue;
    private IValue secondValue;

    public MinusExpression(IValue first, IValue second) {
        this.firstValue = first;
        this.secondValue = second;
    }

    @Override
    public Float getValue() {
        return this.firstValue.getValue() - this.secondValue.getValue();
    }
}
