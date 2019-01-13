package Lista;

public class LinkedList {

    public Node head;


    public void add(int i) {
        Node tempNode = new Node(i);
        if (head == null) {
            head = tempNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            if (current.next == null) {
                current.next = tempNode;
            }
        }

    }


    public void printNodes() {
        Node current = head;
        if (current != null) {
            System.out.println(current.value);
        }
        while (current.next != null) {
            System.out.println(current.next.value);
            current = current.next;
        }

    }
}
