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

public class Main {

   
    public Node insertAtIndex(Node head, int x, int index) {
        Node newNode = new Node(x);
        
        if (index == 0) {
            newNode.next = head;
            return newNode;  
        }

        Node curr = head;

        for (int count = 0; count < index - 1; count++) {
            if (curr == null) {
                System.out.println("Index out of range!");
                return head;  
            }
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

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
        Main list = new Main();
        Node head = new Node(2);  
        head = list.insertAtIndex(head, 10, 1);  
        head = list.insertAtIndex(head, 20, 2);  
        head = list.insertAtIndex(head, 30, 3); 

        head = list.insertAtIndex(head, 15, 2);  

        list.printList(head);  // Output: 2 10 15 20 30
    }
}
