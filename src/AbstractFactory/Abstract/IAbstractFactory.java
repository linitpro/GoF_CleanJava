package AbstractFactory.Abstract;

import AbstractFactory.ConcreteProducts.Cat;
import AbstractFactory.ConcreteProducts.Dog;
import AbstractFactory.ConcreteProducts.Human;

public interface IAbstractFactory {
    IMammal CreateCat();
    IMammal CreateDog();
    IMammal CreateHuman();
}
