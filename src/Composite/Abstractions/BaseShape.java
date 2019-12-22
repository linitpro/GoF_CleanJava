package Composite.Abstractions;

import Composite.Main;

/**
 * Представляет базовый функционал для простых объектов
 */
public abstract class BaseShape implements IShape {
    @Override
    public void add(IShape shape) throws Exception {
        throw new Exception(Main.EXCEPTION_TEXT);
    }

    @Override
    public void remove(IShape shape) throws Exception {
        throw new Exception(Main.EXCEPTION_TEXT);
    }
}
