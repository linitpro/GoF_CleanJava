package Prototype.Elements.ImageElements;

import Prototype.Elements.IElement;
import Prototype.Elements.IImageElement;

public class BackgroundImageElement implements IImageElement {
    private Integer transparent;
    private String name;

    public BackgroundImageElement(Integer transparent, String name) {
        this.transparent = transparent;
        this.name = name;
    }

    public BackgroundImageElement() {
    }

    public Integer getTransparent() {
        return transparent;
    }

    public void setTransparent(Integer transparent) {
        this.transparent = transparent;
    }

    /**
     * Возвращает имя элемента
     *
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Отрисовывает элемент в окне
     */
    @Override
    public void draw() {
        System.out.println(String.format("name: %s, transparent: %s", this.name, this.transparent));
    }

    @Override
    public IElement clone() {

        return new BackgroundImageElement(this.transparent, this.name);
    }
}
