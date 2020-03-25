package Flyweight;

public class GlyphContext {
    private Font font;

    public GlyphContext() {

    }

    public void setFont(Font font) {
        this.font= font;
    }

    public Font getFont() {
        return this.font;
    }
}
