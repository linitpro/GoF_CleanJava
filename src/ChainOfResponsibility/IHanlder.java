package ChainOfResponsibility;

public interface IHanlder {
    public Boolean hasHelp();
    public void printHelp();
    public void handle();
    public void setNext(IHanlder hanlder);
}
