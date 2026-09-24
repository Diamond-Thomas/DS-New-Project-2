import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack<String> PancakeStack = new Stack<>();

        //adds three pancakes to the stack
        PancakeStack.push("Pancake 1");
        PancakeStack.push("Pancake 2");
        PancakeStack.push("Pancake 3");

        //checks last in pancakes stack
        System.out.println(PancakeStack.peek());

        //takes last in pancake stack
        PancakeStack.pop();

        //prints out new last in pancake stack
        System.out.println(PancakeStack.peek());

        //checks if empty
        boolean empty = PancakeStack.isEmpty();
        System.out.println(empty);

    }
}