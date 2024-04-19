//both slow and fast star from the head 
//here we take approach like slow and fast pointer ->slow moves 1 at a time while fast moves 2 (double the sppeed of slow)
//in ODD case -> when fast.next=null -> we would have found the middle -> that is where the slow points
//in EVEN case-> when fast=null -> we would have found the middle -> that is where the slow points


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
  
class MiddleOfLL { 
    
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=new Node(50);
    	printlist(head);
    	System.out.print("Position of element in Linked List: ");
    	printMiddle(head);
    	
    } 
    
    static void printMiddle(Node head){
        if(head==null)return;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }
    
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
} 
