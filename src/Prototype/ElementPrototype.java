package Prototype;

import Prototype.Elements.IElement;
import Prototype.Elements.ImageElements.BackgroundImageElement;
import Prototype.Elements.ImageElements.IconImageElement;
import Prototype.Elements.TextElements.MultipleStringTextElement;
import Prototype.Elements.TextElements.SingleStringTextElement;
import org.jetbrains.annotations.NotNull;

public class ElementPrototype {
    private SingleStringTextElement singleStringElementPrototype;
    private MultipleStringTextElement multipleStringTextElement;
    private IconImageElement iconImageElement;
    private BackgroundImageElement backgroundImageElement;

    public ElementPrototype() {
        // инициализируем прототипы элементов
        this.singleStringElementPrototype = new SingleStringTextElement("set from proto", "name from proto");
        this.multipleStringTextElement = new MultipleStringTextElement("set from proto", "set from proto", "name from proto");
        this.iconImageElement = new IconImageElement(123, "name from proto");
        this.backgroundImageElement = new BackgroundImageElement(123, "name from proto");

    }

    /**
     * Создает обеъкт типа MultipleStringTextElement используя его прототип
     * @param text1 текст первой строки
     * @param text2 текст второй строки
     * @return
     */
    public IElement CreateMultipleStringTextElement(String text1, String text2) {
        var element = this.getElement(this.multipleStringTextElement);
        element.setText1(text1);
        element.setText2(text2);
        return element;
    }

    /**
     * Создает обеъкт типа SingleStringTextElement используя его прототип
     * @param text
     * @return
     */
    public IElement CreateSingleStringElement(String text) {
        var element = this.getElement(this.singleStringElementPrototype);
        element.setText(text);
        return element;
    }

    /**
     * Создает обеъкт типа IconImageElement используя его прототип
     * @param size
     * @return
     */
    public IElement CreateIconImageElement(Integer size) {
        var element = this.getElement(this.iconImageElement);
        element.setSize(size);
        return element;
    }

    /**
     * Создает обеъкт типа BackgroundImageElement используя его прототип
     * @param transparent
     * @return
     */
    public IElement CreateBackgroundImageElement(Integer transparent) {
        var element = this.getElement(this.backgroundImageElement);
        element.setTransparent(transparent);
        return element;
    }

    private <TElement extends IElement> TElement getElement(TElement element) {
        return (TElement) (element.clone());
    }
}
