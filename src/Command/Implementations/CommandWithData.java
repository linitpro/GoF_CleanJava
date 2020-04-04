package Command.Implementations;

import Command.ICommand;

public class CommandWithData implements ICommand {
    private String name;

    public CommandWithData(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("commandWithData executed with data = " + this.name);
    }
}
