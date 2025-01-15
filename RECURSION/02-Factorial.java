public class Factorial {

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int temp = factorial(n - 1); 
        return n * temp; 
    }

    public static void main(String[] args) {
        int n = 5; 
        int result = factorial(n);
        System.out.println(result);
    }
}
