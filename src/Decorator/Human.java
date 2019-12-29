package Decorator;

import Decorator.Decorator.ISkillDecorator;
import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private List<ISkillDecorator> decorators;

    @Contract(pure = true)
    public Human() {
        this.decorators = new ArrayList<ISkillDecorator>();
    }

    public void add(ISkillDecorator skillDecorator) {
        this.decorators.add(skillDecorator);
    }

    public void _do() {
        for (int i =0; i < this.decorators.size(); i++) {
            ((ISkillDecorator) this.decorators.get(i)).Do();
        }
    }
}
