package Prototype.Elements;

public interface IElement {
    /**
     * Возвращает имя элемента
     * @return
     */
    String getName();

    /**
     * Отрисовывает элемент в окне
     */
    void draw();

    IElement clone();
}
