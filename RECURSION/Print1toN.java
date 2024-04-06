public class Print1toN {
   
    static void rec(int n){
        if(n==0) return;


        rec(n-1);
        System.out.println(n);
        

    }
    public static void main(String[] args) {
        int n=4;
        rec(n);
    }
}
