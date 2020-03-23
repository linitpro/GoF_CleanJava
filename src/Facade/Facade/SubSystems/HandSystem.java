package Facade.Facade.SubSystems;

public class HandSystem {
    private FingerSystem left;
    private FingerSystem right;

    public HandSystem() {
        this.left = new FingerSystem();
        this.right = new FingerSystem();
    }

    /***
     * Взять
     */
    public void take(Object obj,Boolean left, Boolean right) {
        Boolean[] fingers = { true, true, true, true, true };
        if(left) {
            this.left.manipulate(fingers);
        }
        if (right) {
            this.right.manipulate(fingers);
        }
    }
}
