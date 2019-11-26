package AbstractFactory;

import AbstractFactory.Abstract.IAbstractFactory;
import AbstractFactory.ConcreteFactories.AsianAnimalFactory;

public class Main {

    private static IAbstractFactory factory = new AsianAnimalFactory();

    public static void main(String[] args)
    {
        var cat = factory.CreateCat();
        cat.Say();

        var dog = factory.CreateDog();
        dog.Say();

        var human = factory.CreateHuman();
        human.Say();
    }
}
