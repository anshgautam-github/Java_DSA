import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class DeleteFirstNodeSLL {

    public Node deleteHead(Node head) {
        if (head ==null) {
            return head;
        }
        
      head = head.next;
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

    public static void main(String args[]) {
        DeleteFirstNodeSLL list = new DeleteFirstNodeSLL();
        Node head = new Node(2);  
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);

        System.out.print("Original List: ");
        list.printList(head);

        head = list.deleteHead(head);

        System.out.print("After Deleting Head: ");
        list.printList(head);  
    }
}
