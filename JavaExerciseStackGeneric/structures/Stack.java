package structures;

public interface Stack<T> {

  int getSize();

  void push(T data);

  public T pop();

  T top();

  boolean isEmpty();
}
