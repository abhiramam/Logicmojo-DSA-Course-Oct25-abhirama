package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }
    public static List<Integer> two_sum(List<Integer> arr, int target) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++){
            int need = target - arr.get(i);
            if (map.containsKey(need)){
                targetList.add(map.get(need));
                targetList.add(i);
                return targetList;
            }
            map.put(arr.get(i), i);
        }
        return null;

    }
}
