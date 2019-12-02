package Builder.ConcreteBuilders;

import Builder.Abstract.CarBuilder;
import Builder.Models.Body;
import Builder.Models.Car;
import Builder.Models.Engine;

public class Kamaz6520Builder implements CarBuilder {
    /**
     * Строит объект Машина
     */
    @Override
    public void buildCar() {
        this.car = new Car();
        this.getCar().setName("Kamaz6250");
    }

    /**
     * Строит Двигатель для Машина
     *
     * @param power
     */
    @Override
    public void buildEngine(Float power) {
        var engine = new Engine(power);
        engine.setFuel("diesel");
        this.getCar().setEngine(engine);
    }

    /**
     * Строит Кузов для Машина
     *
     * @param doorsCount
     */
    @Override
    public void buildBody(Integer doorsCount) {
        var body = new Body(doorsCount);
        body.setColor("Green");
        this.getCar().setBody(body);
    }

    /**
     * Возвращает построенную Машину
     *
     * @return
     */
    @Override
    public Car getCar() {
        return this.car;
    }

    private Car car;
}
