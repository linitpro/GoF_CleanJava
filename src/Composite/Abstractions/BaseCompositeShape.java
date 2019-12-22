package Composite.Abstractions;

import Composite.Main;

import java.util.List;

/**
 * Представляет базовый функционал для композитных объектов
 */
public abstract class BaseCompositeShape extends BaseShape {
    private List<IShape> shapes;

    @Override
    public void add(IShape shape) throws Exception {
        this.shapes.add(shape);
    }

    @Override
    public void remove(IShape shape) throws Exception {
        this.shapes.add(shape);
    }
}
