import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
  
public class InsertAtEndSLL { 
    
    
    public Node insertEnd(Node head, int x){
        Node newNode=new Node(x);
	if(head==null){return newNode;}
	Node curr=head;
	while(curr.next!=null){
		curr=curr.next;
	}
	curr.next=newNode;
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

    public static void main(String args[]) 
    { 
	    InsertAtEndSLL list=new InsertAtEndSLL();
            Node head=new Node(2);
	    head=list.insertEnd(head,10);
	    head=list.insertEnd(head,20);
	    head=list.insertEnd(head,30);
	    list.printList(head);
    	
    } 
    

} 
