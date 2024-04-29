import java.io.*;
import java.util.*;

class MyStack{
    int arr[];
    int cap;
    int top;    //used as a indexing var, start from -1;
    MyStack(int c){
        top=-1;
        cap=c;
        arr=new int [cap];
        
    }
    
    void push(int x){
        if(top==cap-1){System.out.println("Stack is full");return;}
        top++;        //since top=-1, we need to increase it first, to bring it to the correct pos
        arr[top]=x;
    }
    
    int pop(){
        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
        int res=arr[top];
        top--;
        return res;
    }
    
    int peek(){
        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
        return arr[top];
    }
    
    int size(){
        return (top+1);
    }
    
    boolean isEmpty(){
        return top==-1;
    }
}

class ImplementaionArray{

public static void main (String[] args)
{
	MyStack s=new MyStack(5);
    s.push(5);
    s.push(10);
    s.push(20);
    System.out.println(s.pop());
    System.out.println(s.size());
    System.out.println(s.peek());
    System.out.println(s.isEmpty());
}
}
