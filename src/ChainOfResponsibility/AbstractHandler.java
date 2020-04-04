package ChainOfResponsibility;

public abstract class AbstractHandler implements IHanlder {
    protected IHanlder next;

    @Override
    public void setNext(IHanlder hanlder) {
        this.next = hanlder;
    }

    @Override
    public void handle() {
        if (this.hasHelp()) {
            this.printHelp();
            return;
        }

        this.next.handle();
    }
}
