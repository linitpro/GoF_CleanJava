package Bridge.Implementor;

public class Car implements ITransport {
    @Override
    public void start() {
        System.out.println("car started");
    }

    @Override
    public void finish() {
        System.out.println("car finished");
    }
}
