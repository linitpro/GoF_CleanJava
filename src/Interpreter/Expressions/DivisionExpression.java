package Interpreter.Expressions;

import Interpreter.IValue;

public class DivisionExpression implements IValue {
    private IValue first;
    private IValue second;

    public DivisionExpression(IValue first, IValue second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Float getValue() {
        return this.first.getValue() / this.second.getValue();
    }
}
