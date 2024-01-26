package bt3Learn;

public class Node<T>{
    T data;
    Node<T> link;

    public Node(T data) {
        this.data = data;
        this.link = null;
    }
}
