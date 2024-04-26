//{ Driver Code Starts

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            int arr[] = new int[N];
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            new Solution().printArrayRecursively(arr, N);
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{


    public static void printArrayRecursively(int arr[], int n)
    {
        // Print the array elements recursively
            
            if(n==0) return;
            
            //can be thought of Nto1 print ques of recusrion 
            
            System.out.print(arr[0]+" ");
            printArrayRecursively(Arrays.copyOfRange(arr,1,n),n-1)  ;  
    }   
}




//if instead of n , index was givien in ques then it would be easy ;
//   public static void printArrayRecursively(int arr[], int index) {
      
      
//       if(index==arr.length) return;
      
//       System.out.print(arr[index]+ " ");
      
//       printArrayRecursively(arr,index+1);
//   }
