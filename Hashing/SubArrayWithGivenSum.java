package Hashing;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SubArrayWithGivenSum {


    static boolean isSum(int []arr, int n ,int sum){
        Set<Integer> h = new HashSet<Integer>();
        int pre_sum = 0;
        for(int i = 0; i < n; i++)
        {
            pre_sum += arr[i];
            if(pre_sum==sum)
                return true;
            if(h.contains(pre_sum-sum) == true)
                return true;
              
                h.add(pre_sum);
        }
        
        return false;
    }

    public static void main (String[] args) 
    {
        int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        int n = arr.length;
        
        System.out.println(isSum(arr, n, sum));
        
    }
}

//TIME COMPLEXITY ->> O(n) same spcae compelxity