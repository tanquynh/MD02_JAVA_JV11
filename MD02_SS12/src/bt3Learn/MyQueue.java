package bt3Learn;

import java.util.NoSuchElementException;

public class MyQueue<T> implements Solution<T>{
    Node<T> front;
    Node<T> rear;
    @Override
    public void enqueue(T data) {
        Node<T> node = new Node<>(data);
        if (front==null){
            this.front = node;
            this.rear= front;
            return;
        }
        this.rear.link = node;
        this.rear = node;
    }

    @Override
    public T dequeue() {
        if (front ==null){
            throw  new RuntimeException("Queue is empty");
        }
        T data = front.data;
        // xóa node đầu tiên
        if (front==rear){
            this.front = null;
            this.rear =null;
        }else {
            this.front = this.front.link;
        }
        return data;
    }

    @Override
    public void displayQueue() {
        Node<T> head = front;
        if (head==null){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        while (head!=null){
            System.out.print(head.data);
            if (head.link!=null){
                System.out.print(", ");
            }
            head = head.link;
        }
        System.out.println("]");
    }
}
