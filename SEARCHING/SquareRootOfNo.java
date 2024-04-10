//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
    long floorSqrt(long x)
    {
        // Base cases: 0 and 1
        if (x == 0 || x == 1)
            return x;

        long start = 1, end = x / 2, ans = 0;

        while (start <= end) {
            long mid = (start + end) / 2;

            // Check if mid * mid is less than or equal to x
            if (mid * mid <= x) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
