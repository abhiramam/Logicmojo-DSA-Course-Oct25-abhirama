package assignments;

import java.util.List;

public class MoveZeros {
    public static List<Integer> move_func(int n, List<Integer> arr) {
        // Write your code here
        int j = 0;
        int temp = 0;
        for(int i= 0; i< n; i++){
            if(arr.get(i) != 0){
                temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                j++;
            }
        }
        return arr;

    }
}
