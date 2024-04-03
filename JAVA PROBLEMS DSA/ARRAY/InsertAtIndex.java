//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class InsertAtIndex {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input testcases
		int testcases = sc.nextInt();
		while(testcases-- > 0)
		{
		    //input size of Array
		    int sizeOfArray = sc.nextInt();
		    int arr[] = new int[sizeOfArray];
		    
		    //input elements in the Array
		    for(int i = 0; i < sizeOfArray-1; i++)
		    {
		        int x;
		        x = sc.nextInt();
		        arr[i] = x;
		    }
		    
		    //input index
		    int index = sc.nextInt();
		    //input element
		    int element = sc.nextInt();
		    
		    Solution obj = new Solution();
		    
		    //calling insertAtIndex() function
		    obj.insertAtIndex(arr,sizeOfArray,index,element);
		    
		    //Printing the array for verification
		    for(int i = 0; i < sizeOfArray;i++)
		    {
		        System.out.print(arr[i] + " ");
		        
		    }
		    
		    System.out.println();
		}
	}
}



// } Driver Code Ends


//User function Template for Java

//Complete this function, Geeks
class Solution
{
    //Function to insert a element at a given index in an array.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //if given index is last index we simply assign the element at last index.
        if(index==sizeOfArray-1)
        {
            arr[index]=element;
            return;
        }
        //if given index is not last index we need to shift all the elements starting
        //from that index to the last element towards right by 1 position.
        arr[sizeOfArray-1] = -1;
         
        //we iterate from last index to the index given.
        for(int i=sizeOfArray-1;i>index;i--)
        {
             //we simply swap the values at ith and (i-1)th index in the array.
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        //Then we insert the given element at given index.
        arr[index]=element;
    }


}
 