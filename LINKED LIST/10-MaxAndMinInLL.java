class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {

    public int findMax(Node head) {
        if (head == null) {
            throw new IllegalArgumentException("List is empty");
        }

        int max = head.data;
        Node current = head;

        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }

        return max;
    }


    public int findMin(Node head) {
        if (head == null) {
            throw new IllegalArgumentException("List is empty");
        }

        int min = head.data;
        Node current = head;

        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }

        return min;
    }

    public static void main(String[] args) {
        Main list = new Main();

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(5);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(30);

        int maxValue = list.findMax(head);
        int minValue = list.findMin(head);

        System.out.println( maxValue);
        System.out.println( minValue);
    }
}
