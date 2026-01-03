package assignments;

import java.util.List;

public class ContainerWithMostWater {
    public static int maxArea(int n, List<Integer> height) {
        // Write your code here
        int i = 0;
        int j = height.size()-1;
        int area = 0;
        while(i<j){
            area = Math.max(area,(j-i)*Math.min(height.get(i),height.get(j)));
            if(height.get(i)<height.get(j)){
                i++;
            }else{
                j--;
            }
        }
        return area;

    }
}
