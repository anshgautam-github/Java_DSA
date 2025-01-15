public class Print1toN {

    public static void printNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        printNumbers(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        int n = 10; 
        printNumbers(n);
    }
}
