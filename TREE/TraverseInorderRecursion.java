import java.util.*;
import java.io.*;
import java.lang.*;

class Node  
{ 
  int key; 
  Node left; 
  Node right; 
  Node(int k){
      key=k;
      left=right=null;
  }
}


class TraverseInorderRecursion { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
    	inorder(root);
    } 
    
    public static void inorder(Node root){
       if(root!=null){
         inorder(root.left);
         System.out.print(root.key+ " ");
         inorder(root.right);
       }
    } 
} 
