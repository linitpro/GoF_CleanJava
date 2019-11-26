package AbstractFactory.ConcreteProducts;

import AbstractFactory.Abstract.IMammal;

/**
 * Кошка
 */
public class Cat implements IMammal {
    @Override
    public void Say() {
        System.out.println("meow");
    }
}
