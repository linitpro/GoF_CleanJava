package Builder;

import Builder.ConcreteBuilders.BmwZ4Builder;
import Builder.ConcreteBuilders.Kamaz6520Builder;

public class Main {

    public static void main(String[] args) {
        BmwZ4Builder bmwBuilder = new BmwZ4Builder();
        bmwBuilder.buildCar();
        bmwBuilder.buildBody(3);
        bmwBuilder.buildEngine(500.4f);
        System.out.println(bmwBuilder.getCar().toString());

        Kamaz6520Builder kamazBuilder = new Kamaz6520Builder();
        kamazBuilder.buildCar();
        kamazBuilder.buildBody(2);
        kamazBuilder.buildEngine(200.8f);
        System.out.println(kamazBuilder.getCar().toString());

        System.out.println("Hello, world!");
    }
}
