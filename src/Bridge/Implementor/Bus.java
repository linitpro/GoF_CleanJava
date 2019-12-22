package Bridge.Implementor;

public class Bus implements ITransport {
    @Override
    public void start() {
        System.out.println("bus started");
    }

    @Override
    public void finish() {
        System.out.println("bus finished");
    }
}
