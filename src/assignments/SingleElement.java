package assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleElement {
    public static void main(String[] args) {

    }
    public static int singlelement(int n, List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : arr) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;

    }

}

