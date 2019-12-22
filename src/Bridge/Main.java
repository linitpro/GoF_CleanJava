package Bridge;

import Bridge.Abstraction.ITransportBridge;
import Bridge.Abstraction.TransportBridge;

public class Main {
    public static void main(String[] args) {
        ITransportBridge bridge1 = new TransportBridge();
        bridge1.start(1);
        bridge1.finish(1);

        ITransportBridge bridge2 = new TransportBridge();
        bridge2.start(1);
        bridge2.finish(1);

        ITransportBridge bridge3 = new TransportBridge();
        bridge3.start(1);
        bridge3.finish(1);

        ITransportBridge bridge4 = new TransportBridge();
        bridge4.start(1);
        bridge4.finish(1);
    }

}
