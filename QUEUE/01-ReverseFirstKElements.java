import java.util.*;

class ReverseFirstKElements{

    public static Queue<Integer> reverse(Queue<Integer> q, int k){

        if(q==null || k<0 || k>q.size()){
            return queue;
        }
      
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<k; i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=0; i<q.size()-k; i++){
            q.add(q.remove()));
        }
     
      return q;  
    }

  public static void main(String []args){
  
    Queue<Integer>q=new LinkedList<>(); 
    q.add(1);
    q.add(2);
    int k=2;
    Queue<Integer> queue =reverse(q,k);
    System.out.println(queue);
    
  }

}
