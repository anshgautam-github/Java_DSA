import java.util.*;
import java.io.*;
import java.lang.*;

class Queue { 
	int front, rear, size; 
	int capacity; 
	int array[]; 

	public Queue(int capacity) 
	{ 
		this.capacity = capacity; 
		front = size = 0; 
		rear = capacity - 1; 
		array = new int[capacity]; 
	} 

	boolean isFull(Queue queue) 
	{ 
		return (queue.size == queue.capacity); 
	} 

	boolean isEmpty(Queue queue) 
	{ 
		return (queue.size == 0); 
	} 

	void enqueue(int item) 
	{ 
		if (isFull(queue)) 
			return; 
		queue.rear = (queue.rear + 1) % queue.capacity; 
		queue.array[queue.rear] = item; 
		queue.size = queue.size + 1; 
		System.out.println(item + " enqueued to queue"); 
	} 

	int dequeue() 
	{ 
		if (isEmpty(queue)) 
			return Integer.MIN_VALUE; 

		int item = queue.array[queue.front]; 
		queue.front = (queue.front + 1) % queue.capacity; 
		queue.size = queue.size - 1; 
		return item; 
	} 

	int front() 
	{ 
		if (isEmpty(queue)) 
			return Integer.MIN_VALUE; 

		return queue.array[queue.front]; 
	} 

	int rear() 
	{ 
		if (isEmpty(queue)) 
			return Integer.MIN_VALUE; 

		return queue.array[queue.rear]; 
	} 
} 

public class ImplementationCiruclarArray { 
	public static void main(String[] args) 
	{ 
		Queue queue = new Queue(1000); 

		queue.enqueue(10); 
		queue.enqueue(20); 
		queue.enqueue(30); 
		queue.enqueue(40); 

		System.out.println(queue.dequeue() 
						+ " dequeued from queue\n"); 

		System.out.println("Front item is "
						+ queue.front()); 

		System.out.println("Rear item is "
						+ queue.rear()); 
	} 
} 
