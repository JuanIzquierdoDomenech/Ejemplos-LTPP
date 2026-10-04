package structures;

public class LinkedStack <T> implements Stack<T> {

    private Node<T> top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(T data) {
        top = new Node<>(data, top);
        size += 1;
    }

    @Override
    public T pop() {
        T data = top.data;
        top = top.next;
        size -= 1;

        return data;
    }

    @Override
    public T top() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
