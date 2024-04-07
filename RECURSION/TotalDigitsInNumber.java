//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n =sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().countDigits(n)); // prints the count of digits 
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the below function
    public static int countDigits(int n)
    {
        // add your code here
        if(n<10) return 1;
        
        return 1+ countDigits(n/10);
        
    }
}

// EG-> 24 -> 24/10 ->> 2 , now base condition will hit so we will get 1, and 1+1= 2
