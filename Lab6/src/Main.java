import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        stack.printStack();
        System.out.println("The top stack's element before deleting: " + stack.peek());
        stack.pop();
        System.out.println("The top stack's element after deleting: " + stack.peek());
    }
}