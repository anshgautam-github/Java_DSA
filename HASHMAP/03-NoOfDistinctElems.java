import java.util.*;

class NoOfDistinctElems{

    public static int distinct(int []arr){
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
  
}
