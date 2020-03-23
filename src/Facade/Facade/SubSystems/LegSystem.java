package Facade.Facade.SubSystems;

public class LegSystem {
    /***
     * Идти на указанное количество шагов в указанном направлении
     * @param stepsCount количество шагов
     * @param degree угол поворота относительно текущего направления
     */
    public void go(int stepsCount, int degree) {
        System.out.println("Gone steps: " + stepsCount + " degree " + degree);
    }
}
