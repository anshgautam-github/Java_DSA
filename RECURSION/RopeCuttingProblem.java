
                                                                  n=23
                                                              /    |    \
                                                            n=12  n=14   n=11
                                                          / | \   / | \   / | \
                                                        1   3  0  3 5 2   0 2 -1
                                                   / | \    
                                                  (-ve all)   (same here)
// here n=23, a=11 , b=9 , c=12
// LOGIC->> substract each node by a ,b ,c to get the three brenches 



                                                                    
import java.io.*;
import java.util.*;

public class RopeCut {
    

static int rope(int n,int a,int b,int c){
    if(n==0) return 0;
    if(n<=-1) return -1;     //sol does not exist

    int res = Math.max(rope(n-a, a, b, c), 
    Math.max(rope(n-b, a, b, c), 
    rope(n-c, a, b, c)));

    if(res==-1) return -1;
    return res+1;

}

public static void main(String[] args) {
    int n = 5, a = 2, b = 1, c = 5;
    	
    System.out.println(rope(n, a, b, c));
    
}

}


