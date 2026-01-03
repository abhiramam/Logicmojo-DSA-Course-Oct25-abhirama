package assignments;

import java.util.List;

public class PermutingArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        A.sort((a, b) -> b - a);
        B.sort((a, b) -> a - b);
        for(int i =0;i<A.size();i++){
            if(A.get(i)+B.get(i) < k){
                return "NO";
            }
        }
        return "YES";


    }
}
