package Chapter3;

import Chapter2.Node;

public class Stack<T> {

    Node<T> top;

    public T pop(){

        if(top != null) {
            T item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    public void push(T item) {

        Node temp = top;
        top = new Node(item);
        top.next = temp;
    }
}
