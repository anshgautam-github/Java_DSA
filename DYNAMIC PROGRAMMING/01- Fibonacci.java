import java.util.*;

class Fibonacci {

    public int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return fibHelper(n, dp);
    }

    public int fibHelper(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int x = fibHelper(n - 1, dp);
        int y = fibHelper(n - 2, dp);
        dp[n] = x + y;
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fib(n));
    }
}
