package assignments;

import java.util.List;

public class RainWaterTrapping {
    public static int rain_water(List<Integer> hei) {
        // Write your code here
        int n = hei.size();
        int leftMax = hei.get(0);
        int rightMax = hei.get(n-1);

        int totalAmount = 0;
        int temp =0;

        int[] leftMaxArray = new int[n];
        int[] rightMaxArray = new int[n];

        leftMaxArray[0] = hei.get(0);
        for(int i=1;i<n;i++){
            leftMaxArray[i] = leftMax;
            leftMax = Math.max(leftMax,hei.get(i));
        }
        rightMaxArray[n-1] = hei.get(n-1);
        for(int i=n-2;i>=0;i--){
            rightMaxArray[i]= rightMax;
            rightMax = Math.max(rightMax,hei.get(i));
        }
        for(int i=0;i<n;i++){
            temp = Math.min(leftMaxArray[i], rightMaxArray[i]) - hei.get(i);
            if(temp>0){
                totalAmount += temp;
            }

        }
        return totalAmount;

    }
}
