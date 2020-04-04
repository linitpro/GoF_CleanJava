package Command;

import Command.Implementations.AddCommand;
import Command.Implementations.CommandWithData;

public class Main {
    public static void main(String[] args) {
        var addCommand = new AddCommand();
        var commandWithData = new CommandWithData("qwerty");

        addCommand.execute();
        commandWithData.execute();

        System.out.println("hello, world");
    }
}
