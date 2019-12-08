package Prototype.Elements.TextElements;

import Prototype.Elements.IElement;
import Prototype.Elements.ITextElement;

public class SingleStringTextElement implements ITextElement {
    public SingleStringTextElement(String text, String name) {
        this.text = text;
        this.name = name;
    }

    public SingleStringTextElement() {
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;
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
        System.out.println(String.format("name: %s, text1: %s", this.name, this.text));
    }

    @Override
    public IElement clone() {
        return new SingleStringTextElement(this.text, this.name);
    }
}
