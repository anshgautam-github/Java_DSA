//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class MaxNDMin
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            
            int input[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                input[i] = Integer.parseInt(str[i]);
            }
            
            //int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            System.out.println(obj.maximumElement(input, n) + " " + obj.minimumElement(input, n));
            
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Get
{
    public static int maximumElement(int arr[],int n)
    {
        // Your code here
        int max=arr[0];
        for(int i=1; i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    
    }
    
    public static int minimumElement(int arr[],int n)
    {
        // YOUR code here
        
        int min=arr[0];
         for(int i=1; i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}

