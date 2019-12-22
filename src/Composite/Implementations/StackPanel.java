package Composite.Implementations;

import Composite.Abstractions.BaseCompositeShape;

public class StackPanel extends BaseCompositeShape {
    private Boolean vertical;

    public StackPanel() {
        this.vertical = false;
    }

    public StackPanel(Boolean vertical) {
        this.vertical = vertical;
    }

    @Override
    public Integer getArea() {
        return 42;
    }

    @Override
    public Integer getLength() {
        return 42;
    }
}
