public class EditorHistory<T> implements HistoryStack<T> {

    T[] data;
    int index;
    String currentState;

    EditorHistory(){
       data = (T[])new Object[15];
        index = 0;
        currentState = "";
    }

    @Override
    public void push(T element) {
        data[index] = element;
        index++;

    }

    @Override
    public T pop() {
        T result = data[index - 1];
        data[index - 1] = null;
        index--;
        return result;
    }

    @Override
    public T peek() {
        return (T) currentState;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public boolean isFull() {
        return index >= 15;
    }


    public void undo(){
        if(!isEmpty()){
            currentState = (String) pop();
        }

    }

    void makeChange(String newState){
        push((T) currentState);
        currentState = newState;

    }




}

