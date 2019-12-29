package Decorator;

import Decorator.Decorator.Implementations.FootballSkillDecorator;
import Decorator.Decorator.Implementations.ProgramingSkillDecorator;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        human.add(new FootballSkillDecorator());
        human.add(new ProgramingSkillDecorator());

        human._do();

        System.out.println("hello world");
    }
}
