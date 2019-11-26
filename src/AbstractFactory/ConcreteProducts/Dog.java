package AbstractFactory.ConcreteProducts;

import AbstractFactory.Abstract.IMammal;

/**
 * Собака
 */
public class Dog implements IMammal {
    @Override
    public void Say() {
        System.out.println("gav");
    }
}
