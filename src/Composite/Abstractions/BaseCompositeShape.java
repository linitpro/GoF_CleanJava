package Composite.Abstractions;

import Adapter.Interfaces.Shape;
import Composite.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Представляет базовый функционал для композитных объектов
 */
public abstract class BaseCompositeShape extends BaseShape {
    private List<IShape> shapes = new ArrayList<IShape>();

    @Override
    public void add(IShape shape) throws Exception {
        this.shapes.add(shape);
    }

    @Override
    public void remove(IShape shape) throws Exception {
        this.shapes.add(shape);
    }
}
