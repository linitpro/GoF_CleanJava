package ChainOfResponsibility.Implementations;

import ChainOfResponsibility.AbstractHandler;

public class Application extends AbstractHandler {
    @Override
    public Boolean hasHelp() {
        return true;
    }

    @Override
    public void printHelp() {
        System.out.println("help about application");
    }
}
