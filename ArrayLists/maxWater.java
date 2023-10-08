package Vansh.ArrayLists;

import java.util.ArrayList;

public class maxWater {

    // in brute force approach time complexity is O(n^2)
    static int storedWater(ArrayList<Integer> height) {
        int maxWater=0;

        // Brute Force
        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int h = Math.min(height.get(i) , height.get(j));   // h is height of the container
                int w = j-i;                                       // w is width of the container
                int currWater = h*w;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }



    // in this Optimzed approach time complexity is O(n)
    static int swOptimized(ArrayList<Integer> height) {

        int lp=0 , rp=height.size()-1 , maxWater = 0; 

        while(lp!=rp) {
            int h = Math.min(height.get(lp), height.get(rp));
            int w = rp - lp;
            int currWater = h*w;
            maxWater = Math.max(maxWater, currWater);
            
            if(height.get(lp) < height.get(rp)) lp++ ;
            else rp--;
        }
        return maxWater;
    }


    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // [1, 8, 6, 2, 5, 4, 8, 3, 7]
        height.add(1); 
        height.add(2);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storedWater(height));
        System.out.println(swOptimized(height));
    }
}
