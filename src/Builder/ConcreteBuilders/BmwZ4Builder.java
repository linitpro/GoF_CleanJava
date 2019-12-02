package Builder.ConcreteBuilders;

import Builder.Abstract.CarBuilder;
import Builder.Models.Body;
import Builder.Models.Car;
import Builder.Models.Engine;

public class BmwZ4Builder implements CarBuilder {

    /**
     * Строит объект Машина
     */
    @Override
    public void buildCar() {
        this.car = new Car();
        this.car.setName("BMW Z4");
    }

    /**
     * Строит Двигатель для Машина
     *
     * @param power
     */
    public void buildEngine(Float power) {
        var engine = new Engine(power);
        engine.setFuel("gas");
        this.car.setEngine(engine);
    }

    /**
     * Строит Кузов для Машина
     *
     * @param doorsCount
     */
    public void buildBody(Integer doorsCount) {
        var body = new Body(doorsCount);
        body.setColor("Yellow");
        this.car.setBody(body);
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
