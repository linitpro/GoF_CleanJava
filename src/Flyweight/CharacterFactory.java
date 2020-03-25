package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class CharacterFactory {
    private List<Character> characters;

    public CharacterFactory() {
        this.characters = new ArrayList<Character>();
    }

    public Character create(char ch) {
        for (int i = 0; i < this.characters.size(); i++)
        {
            if(this.characters.get(i).getChar() == ch) {
                return this.characters.get(i);
            }
        }

        var character = new Character();
        character.setChar(ch);
        this.characters.add(character);

        return character;
    }
}
