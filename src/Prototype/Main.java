package Prototype;

import Prototype.Elements.IElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("started");

        // создадим документ
        Document document = new Document();
        var proto = new ElementPrototype();

        var multipleTextElement = proto.CreateMultipleStringTextElement("text1 from param", "text2 from param");
        multipleTextElement.draw();
        var singleTextElement = proto.CreateSingleStringElement("text from param");
        singleTextElement.draw();
        var iconImageElement = proto.CreateIconImageElement(456);
        iconImageElement.draw();
        var backgroundImageElement = proto.CreateBackgroundImageElement(456);
        backgroundImageElement.draw();
    }

}
