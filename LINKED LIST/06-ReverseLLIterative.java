import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLLIterative {

    public Node reverseList(Node head) {
        
       Node curr=head;
       Node prev=null;
       while(curr!=null){
           Node currp1=curr.next;
           curr.next=prev;
           prev=curr;
           curr=currp1;
       }
       head=prev;
       return head;
    }

    public void printList(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLLIterative list = new ReverseLLIterative();

        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);

        System.out.print("Original list: ");
        list.printList(head);

        head = list.reverseList(head);

        System.out.print("Reversed list: ");
        list.printList(head);
    }
}
