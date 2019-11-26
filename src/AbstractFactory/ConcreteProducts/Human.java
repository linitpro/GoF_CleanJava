package AbstractFactory.ConcreteProducts;

import AbstractFactory.Abstract.IMammal;

/**
 * Человек
 */
public class Human implements IMammal {
    @Override
    public void Say() {
        System.out.println("fuck");
    }
}