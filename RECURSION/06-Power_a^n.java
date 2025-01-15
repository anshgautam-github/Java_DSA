public class Power_a^n {

  
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = power(a, n - 1);
        return a * temp; 
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 5; 
        int result = power(a, n);
        System.out.println(result);
    }
}
