package assignments;

import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }
    public static int remove_dupli(List<Integer> arr) {
        // Write your code here
        if(arr.size() == 0){
            return 0;
        }
        int i = 0;
        int count = 1;
        int temp = 0;
        for (int j=1;j<arr.size();j++){
            if(arr.get(i) != arr.get(j)){
                count++;
                i++;
                temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
        return count;

    }
}
