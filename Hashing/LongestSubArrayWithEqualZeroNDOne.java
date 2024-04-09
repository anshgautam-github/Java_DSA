package Hashing;
import java.util.*;
import java.io.*;
import java.lang.*;

//it's same problem as LongestSsubArraysum -> here we repalce 0 by -1 and then write the same code for finding sum 0

public class LongestSubArrayWithEqualZeroNDOne {
    public static void main (String[] args) {
        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
        int len = arr.length;
        
        System.out.println(largestZeroSubarray(arr, len));
    }
    
    static int largestZeroSubarray(int arr[], int n)
    {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
        for(int i = 0; i < n; i++)
         arr[i] = (arr[i] == 0) ? -1 : 1;
         
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if (sum == 0)
             maxLen = i+1;
             
            if(hm.containsKey(sum + n) == true)
            {
                if(maxLen < i - hm.get(sum + n))
                 maxLen = i - hm.get(sum + n);
                
            }else hm.put(sum + n, i);
        }
        return maxLen;
    }
}

//TIME COMPLEXITY ->> O(n) same spcae compelxity