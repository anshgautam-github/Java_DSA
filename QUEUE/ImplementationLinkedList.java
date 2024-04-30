import java.util.*;
import java.io.*;
import java.lang.*;

class Node { 
	int key; 
	Node next; 

	 
	public Node(int key) 
	{ 
		this.key = key; 
		next = null; 
	} 
} 


class Queue { 
	Node front, rear; 

	public Queue() 
	{ 
		front = rear = null; 
	} 

	
	void enqueue(int key) 
	{ 

		
		Node temp = new Node(key); 

		
		if (rear == null) { 
			front = rear = temp; 
			return; 
		} 

		
		rear.next = temp; 
		rear = temp; 
	} 

	 
	void dequeue() 
	{ 
		
	if (front == null) 
			return; 

		
		Node temp = front; 
		front = front.next; 

		
		if (front == null) 
			rear = null; 
	} 
} 

 
public class ImplementationLinkedList { 
	public static void main(String[] args) 
	{ 
		Queue q = new Queue(); 
		q.enqueue(10); 
		q.enqueue(20); 
		q.dequeue(); 
		q.dequeue(); 
		q.enqueue(30); 
		q.enqueue(40); 
		q.enqueue(50); 
		q.dequeue(); 
		System.out.println("Queue Front : " + q.front.key); 
		System.out.println("Queue Rear : " + q.rear.key); 
	} 
}
