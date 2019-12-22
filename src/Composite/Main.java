package Composite;

import Composite.Implementations.Circle;
import Composite.Implementations.Rectangle;
import Composite.Implementations.StackPanel;

public class Main {
    public static void main(String[] args) throws Exception {
        var stackPanel = new StackPanel(false);
        // ошибки, не будет, т.к. StackPanel является композитным объектом
        stackPanel.add(new Rectangle());
        stackPanel.add(new Circle());

        var circle = new Circle();
        // будет оишбка выполнения, т.к. Круг не композитный объект
        circle.add(new Rectangle());

        System.out.println("hello world");
    }

    public static final String EXCEPTION_TEXT = "object of this type doesn't support this method";
}
