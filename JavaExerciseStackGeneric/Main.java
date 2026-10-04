import structures.LinkedStack;

public class Main {
    public static void main(String[] args) {
        LinkedStack<Integer> stack1 = new LinkedStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        int d1 = stack1.pop();
        System.out.println(d1);
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        LinkedStack<Double> stack2 = new LinkedStack<>();
        stack2.push(1.8);
        stack2.push(2.3);
        stack2.push(3.9);

        double d2 = stack2.pop();
        System.out.println(d2);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }
}