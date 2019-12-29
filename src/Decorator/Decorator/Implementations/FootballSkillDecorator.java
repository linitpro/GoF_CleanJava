package Decorator.Decorator.Implementations;

import Decorator.Decorator.ISkillDecorator;

public class FootballSkillDecorator implements ISkillDecorator {
    @Override
    public void Do() {
        System.out.println("football");
    }
}
