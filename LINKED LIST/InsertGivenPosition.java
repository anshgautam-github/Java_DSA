class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

class InsertGivenPosition {
    Node insertAtPos(Node head, int x, int pos) {
        Node temp = new Node(x);
        if (head == null) {
            if (pos == 1) return temp;
            else return head;
        }
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
            if (curr == null) {
                System.out.println("Position out of range");
                return head;
            }
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        LinkedList ll = new LinkedList();
        ll.printlist(head);
        head = ll.insertAtPos(head, 25, 2);
        ll.printlist(head);
    }
}
