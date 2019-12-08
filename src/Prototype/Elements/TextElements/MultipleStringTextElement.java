package Prototype.Elements.TextElements;

import Prototype.Elements.IElement;
import Prototype.Elements.ITextElement;

public class MultipleStringTextElement implements ITextElement {
    public MultipleStringTextElement(String text1, String text2, String name) {
        this.text1 = text1;
        this.text2 = text2;
        this.name= name;
    }

    public MultipleStringTextElement() {
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    private String text1;
    private String text2;
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
        System.out.println(String.format("name: %s, text1: %s, text2: %s", this.name, this.text1, this.text2));
    }

    @Override
    public IElement clone() {
        return new MultipleStringTextElement(this.text1, this.text2, this.name);
    }


}
