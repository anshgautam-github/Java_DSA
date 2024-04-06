public class Pallindrome {
    

    static boolean pallin(String str, int start, int end){

        if(start>=end) return true;    //BASE CASE
        
        return (str.charAt(start)==str.charAt(end) && pallin(str, start+1, end-1) );
    }  
    public static void main(String[] args) {
        String sample="abba";
        System.out.println(pallin(sample,0,sample.length()-1));    
    }
}


// Explaination for BASE CASE:

// If you take example of an even string, and draw the recursive tree, u will find that start-end
// If you take example of an odd string, and draw the recursive tree, u will find that start will be
//one place ahead of end =>> start>end
