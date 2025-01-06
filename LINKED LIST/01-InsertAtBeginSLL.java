
// class Node {
//     int val;
//     Node next;

//     Node(int val) {
//         this.val = val;
//         this.next = null;  
//     }
// }

// public class LinkedList {
    
 
//     public void insertAtHead(Node head, int val) {
//         Node newNode = new Node(val);
//         newNode.next = head;
//         head = newNode;
//     }

//     public void printList(Node head) {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.val + " "); 
//             current = current.next;             
//         }  
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
        
//         Node head = null; 
//         list.insertAtHead(head, 5);  // List: 5
//         list.insertAtHead(head, 10); // List: 10 -> 5
//         list.insertAtHead(head, 15); // List: 15 -> 10 -> 5

//         list.printList(head);  // Output will be: 15 10 5
//     }
// }

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {
    
    public Node insertAtHead(Node head, int val) {
        Node newNode = new Node(val);  
        newNode.next = head;          
        head = newNode;                
        return head;                  
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Main list = new Main();
        
        Node head = new Node(10);  
        
        head = list.insertAtHead(head, 5); 
        head = list.insertAtHead(head, 20); 
        head = list.insertAtHead(head, 15); 

        list.printList(head); 
    }
}
