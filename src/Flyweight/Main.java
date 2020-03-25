package Flyweight;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        var document = new Document(characterFactory);
        var row = document.insertRow();
        var font = new Font();
        row.addChar('3', font);
        row.addChar('4', font);

        System.out.println("hello, world!.l ");
    }
}
