package Prototype;

import Prototype.Elements.IElement;

import java.util.List;

public class Document {
    private List<IElement> elements;

    public void addElement(IElement element) {
        this.elements.add(element);
    }

    public void removeElement(IElement element) {
        this.elements.remove(element);
    }
}
