package Composite.Implementations;

import Composite.Abstractions.BaseShape;

public class Circle extends BaseShape {

    @Override
    public Integer getArea() {
        return 42;
    }

    @Override
    public Integer getLength() {
        return 42;
    }
}
