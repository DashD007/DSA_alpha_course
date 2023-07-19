import java.util.*;
public class lecture_98 {
    public static int TrappedWater(int height[]){
        int n = height.length;
        //calculate left max boundary;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        //calculate right max boundary;
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //calculating trapped water;
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel= Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        // in this we will discuss about the trapped water problem
        int height[] = {4,4,4,4,4,3};
        System.out.println(TrappedWater(height));
    }
}
