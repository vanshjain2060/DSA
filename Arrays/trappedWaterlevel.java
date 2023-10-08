package Vansh.Arrays;

public class trappedWaterlevel {
    public static int trappedRainwater(int height[]){
        int n = height.length;
        //Calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
           leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }

         // Calculate right max boundary - array
         int rightMax[] = new int [n];
         rightMax[n-1] = height[n-1];
         for(int i=n-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
         
        int trappedWater = 0;
        //Loop
        for(int i=0 ; i<n ; i++){
            // water level = min(leftmax boundary ,rightmax boudary)
           int waterLevel =Math.min(leftMax[i], rightMax[i]);
       
           // traped water = waterLevel - hihght[i]
         trappedWater += (waterLevel - height[i]);

        }
   return trappedWater ;

    }
    public static void main(String[] args) {
         int height[] = {4,2,0,6,3,2,5};
         System.out.println(trappedRainwater(height));
       

    }
}
