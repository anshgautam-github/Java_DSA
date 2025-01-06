class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class JoinTwoLL {

    public Node joinLists(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1; 
        Node current = head1;
        while (current.next != null) {
            current = current.next; 
        }
        current.next = head2;
        return head1; 
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        JoinTwoLL list = new JoinTwoLL();

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);

        Node joinedList = list.joinLists(head1, head2);

        list.printList(joinedList);
    }
}
