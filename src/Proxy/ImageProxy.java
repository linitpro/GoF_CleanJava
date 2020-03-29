package Proxy;

public class ImageProxy implements IGraphic {
    private IGraphic graphic;

    private IGraphic getGraphic() {
        if(this.graphic == null) {
            this.graphic = new Image();
        }

        return this.graphic;
    }

    public ImageProxy() {

    }

    @Override
    public void draw() {
        this.getGraphic().draw();
    }

    @Override
    public void drawWithAccess(Boolean isAdmin) {
        this.graphic.drawWithAccess(isAdmin);
    }
}
