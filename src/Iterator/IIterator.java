package Iterator;

public interface IIterator<TItem> {
    void first();
    void next();
    boolean isDone();
    TItem current() throws Exception;
}
