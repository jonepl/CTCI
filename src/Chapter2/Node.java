package Chapter2;

public class Node<T> {
    public T data;
    public Node next;

    public Node(T value) {
        this.next = null;
        this.data = value;
    }

    public void add(T value) {

        Node last = new Node(value);
        Node n = this;
        while(n.next != null) { n = n.next; }
        n.next = last;
    }

    public Node remove(Node head, T value) {

        if(head == null) return head;

        Node n = head;
        if(head.data == value) {
            Node next = head.next;
            head.data = next.data;
            head.next = next.next;
            next.next = null;
            return head;
        }

        while(n.next != null) {
            if(n.next.data == value) {
                Node temp = n.next;
                n.next = n.next.next;
                temp.next = null;
                break;
            }
            n = n.next;
        }
        return head;
    }

    public String print() {

        String result = this.data.toString() + " -> ";
        result += this.next == null ? "*" : this.next.print();

        return result;
    }
}
