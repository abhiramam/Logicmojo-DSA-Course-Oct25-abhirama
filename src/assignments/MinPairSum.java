package assignments;

import java.util.Collections;
import java.util.List;

public class MinPairSum {
    public static int minPairSum(int n, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int i =0;
        int j=arr.size()-1;
        int sum =0;
        while(i<j){
            sum = Math.max(sum,arr.get(i)+arr.get(j));
            i++;
            j--;
        }
        return sum;

    }
}
