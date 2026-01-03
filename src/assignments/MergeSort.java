package assignments;


import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static List<Integer> sort(int n, List<Integer> arr) {
        // Write your code here
        if(arr.size() == 1){
            return arr;
        }
        int mid = arr.size()/2;
        List<Integer> leftList = arr.subList(0,mid);
        List<Integer> rightList = arr.subList(mid,arr.size());
        return merge(sort(n,leftList),sort(n,rightList));


    }

    public static List<Integer> merge(List<Integer> nums1, List<Integer> nums2){
        List<Integer> res = new ArrayList<>();
        int i = 0 , j = 0;
        int k = 0;
        while(i<nums1.size() && j<nums2.size()){
            if(nums1.get(i) > nums2.get(j)){
                res.add(k++,nums2.get(j));
                j++;
            }else{
                res.add(k++,nums1.get(i));
                i++;
            }
        }
        while(i<nums1.size()){
            res.add(k++,nums1.get(i));
            i++;
        }
        while(j<nums2.size()){
            res.add(k++,nums2.get(j));
            j++;
        }
        return res;
    }
}
