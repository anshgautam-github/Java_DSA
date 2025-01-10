import java.util.*;

class FirstNonRepeating{

  public static int nonRepeating(int[]arr){
     
    HashMap<Integer,Integer>hm=new HashMap<>();
      
    for(int i=0; i<arr.length; i++){
          if(!hm.containsKey(arr[i])){
              hm.put(arr[i],1);
          }else{
              int temp=hm.get(arr[i]);
              hm.put(arr[i], temp+1);
          }
      }

      for(int i=0; i<arr.length; i++){
          if(hm.get(arr[i])==1){
            return arr[i];
          }
      }
      return -1;
      
  }
  
}
