package Composite.Abstractions;

/**
 * Общий интерфейс для объектов реализующих интерфейс "Фигура"
 */
public interface IShape {

    Integer getArea();
    Integer getLength();

    void add(IShape shape) throws Exception;
    void remove(IShape shape) throws Exception;
}
