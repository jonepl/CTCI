package Chapter3;

import Chapter2.Node;

public class Queue<T> {

    Node<T> front;
    Node <T> rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(T item) {

        if(front == null) {
            rear = new Node(item);
            front = rear;
        } else {
            rear.next = new Node(item);
            rear = rear.next;
        }
    }

    public T dequeue() {

        if(front == null) return null;

        T data = front.data;
        front = front.next;
        return data;
    }
}
