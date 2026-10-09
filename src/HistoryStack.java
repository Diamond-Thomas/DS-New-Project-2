import java.util.Stack;

public interface HistoryStack<T> {

    public void push(T element);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public boolean isFull();

}
