package Iterator;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.List;

public class ListIterator<TITem> implements IIterator<TITem> {
    private List<TITem> list;
    private Integer current;

    public ListIterator(List<TITem> list) {
        this.list = list;
        this.first();
    }

    @Override
    public void first() {
        this.current = 0;
    }

    @Override
    public void next() {
        this.current++;
    }

    @Override
    public boolean isDone() {
        return this.current >= this.list.size();
    }

    @Override
    public TITem current() throws Exception {
        if (this.isDone()) {
            throw new Exception("index out of bound exception");
        }

        return this.list.get(this.current);
    }
}
