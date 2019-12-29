package Decorator.Decorator.Implementations;

import Decorator.Decorator.ISkillDecorator;

public class ProgramingSkillDecorator implements ISkillDecorator {
    @Override
    public void Do() {
        System.out.println("program");
    }
}
