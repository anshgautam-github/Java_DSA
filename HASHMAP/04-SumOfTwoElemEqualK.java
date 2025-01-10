//given -> arr[n], check if there exist a pair(i,j) such that arr[i]+arr[j]==k and (i!=j)

import java.util.*;

class SumOfTwoElemEqualK{

    public static boolean check(int[]arr,int k){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                int temp=hm.get(arr[i]);
                hm.put(arr[i], temp+1);
            }
        }

        for(int i=0; i<arr.length;i++){
            int a=arr[i];
            int b=k-a;

            if(a!=b && hm.containsKey(b)){
                return true;
            }else if(a==b && hm.get(b)>=2){
                return true;
            }
        }

        return false;
    }
    
}
