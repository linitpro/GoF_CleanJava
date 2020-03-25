package Flyweight;

public class Character implements Glyph {
    private char ch;

    public char getChar() {
        return this.ch;
    }

    public void setChar(char ch) {
        this.ch = ch;
    }

    @Override
    public void draw() {

    }
}
