package Adapter.Impl0;

import Adapter.Interfaces.IShape;
import Adapter.Interfaces.IView;
import Adapter.Interfaces.Shape;

public class Impl0View implements IView {

    private IShape shape;

    public Impl0View() {
        this.shape = new Shape();
    }

    @Override
    public void setView(Integer x0, Integer y0, Integer height, Integer weight) {
        var x1 = x0;
        var y1 = y0;
        var x2 = x0 + height;
        var y2 = y0 + weight;

        this.shape.set(x1, y1, x2, y2);
    }
}
