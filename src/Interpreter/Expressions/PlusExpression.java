package Interpreter.Expressions;

import Interpreter.IValue;

public class PlusExpression implements IValue {
    private IValue firstValue;
    private IValue secondValue;

    @Override
    public Float getValue() {
        return firstValue.getValue() + secondValue.getValue();
    }
}
