class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class DeleteLastNodeSLL {

   public Node deleteLast(Node head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node curr = head;
        while (curr.next != null && curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        return head;
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
        DeleteLastNodeSLL list = new DeleteLastNodeSLL();

        Node head = new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(5);

        head = list.deleteLast(head); 
        list.printList(head); 

    }
}
