package AbstractFactory.ConcreteFactories;

import AbstractFactory.Abstract.IAbstractFactory;
import AbstractFactory.Abstract.IMammal;
import AbstractFactory.ConcreteProducts.Cat;
import AbstractFactory.ConcreteProducts.Dog;
import AbstractFactory.ConcreteProducts.Human;

public class AsianAnimalFactory implements IAbstractFactory {

    @Override
    public IMammal CreateCat() {
        return new Cat();
    }

    @Override
    public IMammal CreateDog() {
        return new Dog();
    }

    @Override
    public IMammal CreateHuman() {
        return new Human();
    }
}
