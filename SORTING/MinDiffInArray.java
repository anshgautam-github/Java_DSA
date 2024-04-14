
import java.util.*;

public class MinDiffInArray {
    public static void main (String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		arr[i] = sc.nextInt();
		
		MinDiffInArray gfg = new MinDiffInArray();
		System.out.println(gfg.getMinDiff(arr, n));
	}

    int getMinDiff(int arr[], int n){

        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            res=Math.min(res, arr[i]-arr[i-1]);
        }
        return res;
    }
}


