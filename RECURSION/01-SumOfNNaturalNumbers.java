public class SumOfNNaturalNumbers {

    public static int sumOfNaturalNumbers(int n) {
       
        if (n == 1) {
            return 1;
        }
        int temp=sumOfNaturalNumbers(n - 1);
        return n +temp ;
    }

    public static void main(String[] args) {
        int n = 10; 
        int result = sumOfNaturalNumbers(n);
        System.out.println(result);
    }
}
