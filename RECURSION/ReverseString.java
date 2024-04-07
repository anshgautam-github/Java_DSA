public class ReverseString {
    
    static String reverseString(String s, String r, int i){

        if(i<0) return r;

        return reverseString(s,r+s.charAt(i),i-1);
    }
    
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(reverseString(s,"", s.length()-1));
    }
}


//NOTE->> since, string is immutable in java, so we wantan empty string and we can concatinate
//with the elemts of string S, we pass the last index and decrease it by 1;