package Bridge.Abstraction;

import Bridge.Implementor.ITransport;

public interface ITransportBridge {
    void start(Integer i);
    void finish(Integer i);
}
