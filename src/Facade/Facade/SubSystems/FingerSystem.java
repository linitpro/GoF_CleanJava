package Facade.Facade.SubSystems;

public class FingerSystem {
    private Boolean[] fingersState;

    public FingerSystem() {
        this.fingersState = new Boolean[5];
    }

    /***
     * Производит манипуляцию пальцами
     * @param fingers
     */
    public void manipulate(Boolean[] fingers) {
        if (fingers == null || fingers.length != 5) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < 5; i++) {
            this.fingersState[i] = fingers[i];
        }
    }
}
