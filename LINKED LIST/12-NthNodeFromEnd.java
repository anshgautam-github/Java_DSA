        //METHOD -> Length Method
    // static void printNthFromEnd(Node head,int n){
    //      int len=0;
    //     for(Node curr=head;curr!=null;curr=curr.next)  //for finding the length of the LL
    //         len++;
    //     if(len<n)  
    //         return;
    //     Node curr=head;
    //     for(int i=1;i<len-n+1;i++)
    //         curr=curr.next;
    //     System.out.print(curr.data);
    // }
class Node {
    int data;
    Node next;
    
    Node(int x) {
        data = x;
        next = null;
    }
}

public class NthNodeFromEnd {

    public Node findNthFromEnd(Node head, int n) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) {
                System.out.println("The list is shorter than " + n + " nodes.");
                return null; s
            }
            first = first.next;
        }
        
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second;
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
        NthNodeFromEnd list = new NthNodeFromEnd();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node nthFromEnd = list.findNthFromEnd(head, 2);
        if (nthFromEnd != null) {
            System.out.println(nthFromEnd.data);
        }
    }
}
