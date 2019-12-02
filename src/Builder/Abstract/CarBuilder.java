package Builder.Abstract;

import Builder.Models.Car;

public interface CarBuilder {
    /**
     * Строит объект Машина
     */
    public void buildCar();

    /**
     * Строит Двигатель для Машина
     * @param power
     */
    public void buildEngine(Float power);

    /**
     * Строит Кузов для Машина
     * @param doorsCount
     */
    public void buildBody(Integer doorsCount);

    /**
     * Возвращает построенную Машину
     * @return
     */
    public Car getCar();
}
