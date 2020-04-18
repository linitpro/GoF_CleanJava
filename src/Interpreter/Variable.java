package Interpreter;

public class Variable implements IValue {
    public String name;
    public Float value;

    public Variable(String name, Float value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public Float getValue() {
        return this.value;
    }
}
