package Chapter2;

public class ChapterTwo {

    public ChapterTwo() { }

    public Node questionOne(Node head) {

        if(head == null) return head;
        Node current = head;

        while(current.next != null) {
            Node cursor = current;
            while(cursor.next != null) {
                if(current.data == cursor.next.data) {
                    if(cursor.next.next == null) {
                        cursor.next = null;
                    }
                    else {
                        cursor.next = cursor.next.next;
                    }
                }
                if(cursor.next != null) cursor = cursor.next;
            }
            if(current.next != null) current = current.next;
        }
        return head;
    }
}
