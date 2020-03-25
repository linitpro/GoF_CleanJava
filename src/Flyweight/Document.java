package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Row> rows;
    private CharacterFactory characterFactory;

    public Document(CharacterFactory characterFactory) {
        rows = new ArrayList<Row>();
        this.characterFactory = characterFactory;

    }

    /***
     * Вставляет новую строку в документ
     */
    public Row insertRow() {
        var row = new Row(this.characterFactory);
        this.rows.add(row);
        return row;
    }

    /***
     * Возвращает строку по ее индексу
     * @param index
     * @return
     */
    public Row getRow(Integer index) {
        if(index < 0 || index > (this.rows.size() - 1)) {
            throw new IllegalArgumentException();
        }

        return this.rows.get(index);
    }
}
