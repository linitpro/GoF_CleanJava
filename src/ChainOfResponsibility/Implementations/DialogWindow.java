package ChainOfResponsibility.Implementations;

import ChainOfResponsibility.AbstractHandler;

public class DialogWindow extends AbstractHandler {
    private String name;

    public DialogWindow(String name) {
        this.name = name;
    }

    @Override
    public Boolean hasHelp() {
        return true;
    }

    @Override
    public void printHelp() {
        System.out.println("help about dialog window " + name);
    }
}
