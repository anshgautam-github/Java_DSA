//Initial Template for Java

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
            String str[] = read.readLine().trim().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            System.out.println(new Solution().GCD(a, b));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

// GCD stands for Greatest Common Divisor. It is the largest positive integer that divides
// both numbers without leaving a remainder. In other words, it is the largest integer that 
// divides both numbers evenly.


// To find the GCD of two numbers a and b, you can use the Euclidean algorithm.
// The Euclidean algorithm states that the GCD of two numbers a and b is equal to the GCD of 
// b and the remainder of a divided by b. 
// This process is repeated until the remainder becomes 0.


class Solution
{
    // Complete the function
    // a: first number
    // b: second number
    public static int GCD(int a, int b)
    {
        // find and return GCD of two numbers;
        if(b==0){
            return a;
        }
        
        return  GCD(b,a%b);
        
    }
}
