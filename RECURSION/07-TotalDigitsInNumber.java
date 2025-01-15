public class TotalDigitsInNumber {

 
    public static int countDigits(int n) {
        if (n == 0) { // Base case: when the number is 0, stop recursion
            return 0;
        }
        int temp = countDigits(n / 10); // Recursive call with n divided by 10
        return 1 + temp; // Add 1 for the current digit
    }

    public static void main(String[] args) {
        int n = 12345; 
        int result = (n == 0) ? 1 : countDigits(n);
        System.out.println(result);
    }
}
