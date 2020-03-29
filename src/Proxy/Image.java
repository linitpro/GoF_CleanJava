package Proxy;

public class Image implements IGraphic {
    @Override
    public void draw() {
        System.out.println("draw image");
    }

    @Override
    public void drawWithAccess(Boolean isAdmin) {
        if (isAdmin) {
            System.out.println("admin draw image");
        }
        else {
            System.out.println("doesn't draw image. not admin");
        }
    }
}
