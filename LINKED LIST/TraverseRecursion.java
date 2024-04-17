class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class TraverseRecursion {
  
    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        printList(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, null)));
        printList(head);
    }
}
