public class EditorHistory<T> implements HistoryStack<T> {

    T[] undoStack;
    int index;
    String currentState;
    T[] redoStack;
    int redoIndex;

    EditorHistory(){
        undoStack = (T[])new Object[15];
        redoStack = (T[])new Object[15];
        index = 0;
        redoIndex = 0;
        currentState = "";
    }

    @Override
    public void push(T element) {
        undoStack[index] = element;
        index++;

    }

    @Override
    public T pop() {
        T result = undoStack[index - 1];
        undoStack[index - 1] = null;
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
            pushRedo(((T) currentState));
            currentState = (String) pop();
        }

    }

    void makeChange(String newState){
        push((T) currentState);
        currentState = newState;

    }

    void redo(){
        if (redoIndex > 0) {
            push((T) currentState);
            currentState = (String) popRedo();
        }
    }
    private void pushRedo(T element) {
        if (redoIndex < redoStack.length) {
            redoStack[redoIndex] = element;
            redoIndex++;
        }
    }
    private T popRedo() {
        if (redoIndex == 0) return null;
        redoIndex--;
        T result = redoStack[redoIndex];
        redoStack[redoIndex] = null;
        return result;
    }



}

