package Flyweight;

import java.util.List;

public class Column {
    private Font font;
    private String string;

    public Column() {
        this.string = "";
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Font getFont() {
        return this.font;
    }

    public void addChar(Character character) {
        this.string += character.getChar();
    }
}