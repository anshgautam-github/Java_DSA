package Searching;

public class BinarySearchRecursion {
    
    static int bSearch(int arr[], int low, int high, int x){
        if (low>high) return -1;

        int mid=low+high/2;
        
        if(arr[mid]==x) return x;
        else if(arr[mid]>x) return bSearch(arr, low, mid-1, x);
        else return bSearch(arr, mid+1, high, x);
    }
    public static void main(String args[]) 
    {
        int arr[] = {10, 20, 30, 40, 50, 60, 70}, n = 7;

		int x = 20;

        System.out.println(bSearch(arr, 0, n - 1, x));
    } 
}
