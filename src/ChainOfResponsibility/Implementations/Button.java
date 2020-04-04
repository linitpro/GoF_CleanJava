package ChainOfResponsibility.Implementations;

import ChainOfResponsibility.AbstractHandler;

public class Button extends AbstractHandler {

    @Override
    public Boolean hasHelp() {
        return false;
    }

    @Override
    public void printHelp() {
        System.out.println("help hot found");
    }
}
