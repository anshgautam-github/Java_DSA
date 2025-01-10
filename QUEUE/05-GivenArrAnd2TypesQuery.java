import java.util.*;

class GivenArrAnd2TypesQuery {
  
    int[] arr;
    TreeSet<Integer> set;
  
    GivenArrAnd2TypesQuery(int n) {
        arr = new int[n];
        set = new TreeSet<>();
    }

    // Query Type 1: Toggle the value at index `i`
    public void type1(int i) {
        if (arr[i] == 0) { 
            arr[i] = 1;
            set.add(i);
        } else {
            arr[i] = 0;
            set.remove(i);
        }
    }

    // Query Type 2: Find the nearest element to index `i`
    public int type2(int i) {
        Integer leftNear = set.floor(i); 
        Integer rightNear = set.ceiling(i); 
        int leftDist = leftNear == null ? Integer.MAX_VALUE : i - leftNear;
        int rightDist = rightNear == null ? Integer.MAX_VALUE : rightNear - i;

        if (leftDist <= rightDist) {
            return leftNear != null ? leftNear : -1; // Return -1 if no left nearest
        } else {
            return rightNear != null ? rightNear : -1; // Return -1 if no right nearest
        }
    }
}
