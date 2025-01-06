class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class SumOfNodesOfLL {

    
    public int sumOfNodes(Node head) {
        int sum = 0;
        Node current = head;

        while (current != null) {
            sum += current.data; 
            current = current.next; 
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfNodesOfLL list = new SumOfNodesOfLL();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int totalSum = list.sumOfNodes(head);
        System.out.println(totalSum);
    }
}
