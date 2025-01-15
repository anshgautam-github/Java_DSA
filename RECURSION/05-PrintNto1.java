//DESCENDING ORDER 

public class PrintNto1 {

  
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " "); 
        printNumbers(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Numbers from " + n + " to 1: ");
        printNumbers(n);
    }
}
