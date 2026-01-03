package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    public static List<Integer> subsetSum(List<Integer> nums, int n) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        subsetSumHelper(0,res,nums,sum);
        Collections.sort(res);
        return res;

    }

    private static void subsetSumHelper(int index, List<Integer> res,List<Integer> nums,int sum){
        if(index == nums.size()){
            res.add(sum);
            return;
        }
        subsetSumHelper(index+1,res,nums, sum+nums.get(index));
        subsetSumHelper(index+1,res,nums, sum);
    }
}
