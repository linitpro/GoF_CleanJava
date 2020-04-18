package Iterator;

import java.util.List;

public class ReverseListIterator <TITem> implements IIterator<TITem> {
    private List<TITem> list;
    private Integer current;

    public ReverseListIterator(List<TITem> list) {
        this.list = list;
        this.first();
    }

    @Override
    public void first() {
        this.current = this.list.size() - 1;
    }

    @Override
    public void next() {
        this.current--;
    }

    @Override
    public boolean isDone() {
        return this.current < 0;
    }

    @Override
    public TITem current() throws Exception {
        if (this.isDone()) {
            throw new Exception("index out of bound exception");
        }

        return this.list.get(this.current);
    }
}
