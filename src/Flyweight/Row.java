package Flyweight;

import javafx.css.converter.LadderConverter;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Column> columns;
    private CharacterFactory characterFactory;

    public Row(CharacterFactory factory) {
        this.characterFactory = factory;
        this.columns = new ArrayList<Column>();
    }

    /***
     * Добавляет символ в конец строки
     */
    public void addChar(char ch, Font font) {
        var character = this.characterFactory.create(ch);

        var lastColumn = this.getAvailableColumn(font);

        if (lastColumn == null) {
            lastColumn = new Column();
            lastColumn.setFont(font);

            this.columns.add(lastColumn);
        }

        lastColumn.addChar(character);
    }

    private Column getAvailableColumn(Font font) {
        if(this.columns.size() == 0) {
            return null;
        }

        if (this.columns.get(this.columns.size() - 1).getFont() == font) {
            return this.columns.get(this.columns.size() - 1);
        }

        return null;
    }
}
