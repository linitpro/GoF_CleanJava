package Bridge.Abstraction;

import Bridge.Implementor.Bus;
import Bridge.Implementor.Car;
import Bridge.Implementor.ITransport;

import java.util.Random;

public class TransportBridge implements ITransportBridge {

    private ITransport transport;

    public TransportBridge() {
        this.transport = this.getTransport();
    }

    /**
     * Возвращает реализацию для интерфейса ITransport
     * @return
     */
    private ITransport getTransport() {
        // сэмулируем создание реализации, в данном паттерне это не важно
        ITransport[] arr = { new Bus(), new Car() };
        Random random = new Random();
        var i = random.nextInt(2);
        return arr[i];
    }

    @Override
    public void start(Integer i) {
        this.transport.start();
    }

    @Override
    public void finish(Integer i) {
        this.transport.finish();
    }
}
