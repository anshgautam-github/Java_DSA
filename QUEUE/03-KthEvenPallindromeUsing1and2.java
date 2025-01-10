import java.util.*;

class Main {

    public static int generate(int k) {
        Queue<String> q = new LinkedList<>();
        q.add("11");
        q.add("22");
        String ans = "";

        for (int i = 0; i < k; i++) {
            ans = q.remove(); 
            String left = ans.substring(0, ans.length() / 2);
            String right = ans.substring(ans.length() / 2);
            q.add(left + "11" + right);
            q.add(left + "22" + right);
        }

        return Integer.parseInt(ans);
    }

    public static void main(String[] args) {
        int k = 5;
        int result = generate(k);
        System.out.println(result);
    }
}
