package assignments;

import java.util.List;

public class DutchNationalFlag {
    public static List<Integer> sort_an_array(int n, List<Integer> arr) {
        // Write your code here
        int low = 0;
        int mid = 0;
        int high = arr.size()-1;
        while(mid<=high){
            if(arr.get(mid).equals(0)){
                int temp = arr.get(mid);
                arr.set(mid,arr.get(low));
                arr.set(low,temp);
                low++;
                mid++;
            }else if(arr.get(mid).equals(1)){
                mid++;
            }else if(arr.get(mid).equals(2)){
                int temp = arr.get(mid);
                arr.set(mid,arr.get(high));
                arr.set(high,temp);
                high--;
            }
        }
        return arr;

    }
}
