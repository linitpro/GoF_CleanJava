package Facade;

import Facade.Facade.HumanFacade;

public class Main {
    public static void main(String[] args) {
        HumanFacade humanFacade = new HumanFacade();
        humanFacade.getBeer();
        System.out.println("hello, world!");
    }
}
