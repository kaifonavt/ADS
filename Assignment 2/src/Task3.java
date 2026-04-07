import java.util.Stack;

public class Task3 {
    public static void sortStack(Stack<Integer> original) {
        Stack<Integer> temp = new Stack<>();

        while (!original.isEmpty()) {
            int current = original.pop();
            while (!temp.isEmpty() && temp.peek() > current) {
                original.push(temp.pop());
            }
            temp.push(current);
        }
        while (!temp.isEmpty()) {
            original.push(temp.pop());
        }
    }
}