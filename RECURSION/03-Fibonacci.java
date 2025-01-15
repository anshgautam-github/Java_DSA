public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) { 
            return 1;
        }
        int temp1 = fibonacci(n - 1);
        int temp2 = fibonacci(n - 2);
        return temp1 + temp2; 
    }

    public static void main(String[] args) {
        int n = 10; 
        int result = fibonacci(n);
        System.out.println(result);
    }
}
