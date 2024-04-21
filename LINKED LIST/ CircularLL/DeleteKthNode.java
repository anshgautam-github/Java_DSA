import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
  
class DeleteKthNode { 
    
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=head;
    	head=deleteKth(head,3);
    	printlist(head);
    	
    } 
    
    public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
    
    static Node deleteKth(Node head,int k){
        if(head==null)return head;
        if(k==1)return deleteHead(head);
        Node curr=head;
        for(int i=0;i<k-2;i++)
            curr=curr.next;
        curr.next=curr.next.next;
        return head;
    }
    
    static Node deleteHead(Node head){
        if(head==null)return null;
        if(head.next==head)
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
} 
