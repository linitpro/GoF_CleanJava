package Facade.Facade;

import Facade.Facade.SubSystems.HandSystem;
import Facade.Facade.SubSystems.LegSystem;

public class HumanFacade {
    private HandSystem handSystem;
    private LegSystem legSystem;

    public HumanFacade() {
        this.handSystem = new HandSystem();
        this.legSystem = new LegSystem();
    }

    public Boolean[] getBeer() {
        Object beer = new Object();

        this.legSystem.go(3, 30);
        this.legSystem.go(5, -30);
        this.handSystem.take(beer, true, true);

        return new Boolean[] {false, false, true, false, false};
    }
}
