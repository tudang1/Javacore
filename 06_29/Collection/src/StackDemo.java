import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //FILO first in Last out
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(9);
        System.out.println(stack);

        System.out.println("Phần Tử đầu tiên: " + stack.peek());
        System.out.println("Phần tử cuối: " + stack.pop());

        System.out.println(stack);
    }
}
