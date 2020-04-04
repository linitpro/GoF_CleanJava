package Command.Implementations;

import Command.ICommand;

public class AddCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("add command executed");
    }
}
