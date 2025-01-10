import java.util.*;

class FrequencyOfEachQuery {

    public static void freq(int[] arr, int[] query) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Populate the HashMap with frequencies of elements in `arr`
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            }
        }

        // Process the `query` array to get frequencies
        for (int i = 0; i < query.length; i++) {
            if (!hm.containsKey(query[i])) { 
                System.out.println(0);
            } else {
                System.out.println(hm.get(query[i])); 
            }
        }
    }
}
