package bt3Learn;

import java.util.NoSuchElementException;

public interface Solution<T> {
    void enqueue(T data);
    T dequeue();
    void displayQueue();

}
