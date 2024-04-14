import java.util.*;
import java.lang.*;
import java.io.*;

class SortArrayWithTwoTypesElements
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{13,-12,18,-10};
        
        int n = arr.length;
        
        sort(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }

    static void sort(int arr[],int n){
        int i=-1, j=n;

        while (true) {
            do {
                i++;
            } while (arr[i]<0);
            do {
                j--;
            } while (arr[i]>0);
            if(i==j) return;

            //swapping 
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

}