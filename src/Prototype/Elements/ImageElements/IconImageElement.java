package Prototype.Elements.ImageElements;

import Prototype.Elements.IElement;
import Prototype.Elements.IImageElement;

public class IconImageElement implements IImageElement {
    public IconImageElement(Integer size, String name) {
        this.size = size;
        this.name = name;
    }

    public IconImageElement() {
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    private Integer size;
    private String name;

    /**
     * Возвращает имя элемента
     *
     * @return
     */
    @Override
    public String getName() {
        return null;
    }

    /**
     * Отрисовывает элемент в окне
     */
    @Override
    public void draw() {
        System.out.println(String.format("name: %s, size: %s", this.name, this.size));
    }

    @Override
    public IElement clone() {
        return new IconImageElement(this.size, this.name);
    }
}
