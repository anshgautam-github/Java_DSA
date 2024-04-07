//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking total testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking n as input
            System.out.println(new Solution().fibonacci(n)); // print the nth fibonacci number
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int fibonacci(int n)
    {
        // your code here
        if(n<=0) return 0;
        if(n==1 || n==2) return 1;
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

