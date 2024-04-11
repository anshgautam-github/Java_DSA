import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{50,20,40,60,10,30};
        
        int n = arr.length;
        iSort(arr,n);
        
        for(int x:arr)
            System.out.print(x+" ");
        
    }
    
    static void iSort(int arr[],int n){
    
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
