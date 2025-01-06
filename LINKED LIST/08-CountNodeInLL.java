class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class CountNodeInLL {

    public int countNodes(Node head) {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        CountNodeInLL list = new CountNodeInLL();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int nodeCount = list.countNodes(head);

        System.out.println(nodeCount);
    }
}
