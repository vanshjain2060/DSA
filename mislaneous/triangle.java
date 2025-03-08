// package Vansh.mislaneous;

import java.util.*;

public class triangle {
    public static void main(String[] args) {
        List<List<Integer>> tri = new ArrayList<>();
        tri.add(Arrays.asList(2));
        tri.add(Arrays.asList(3, 4));
        tri.add(Arrays.asList(6, 5, 1));
        tri.add(Arrays.asList(4, 1, 8, 3));
        System.out.println(minimunTotal(tri));
    }

    private static int minimunTotal(List<List<Integer>> tri) {
        int n = tri.size();
        List<Integer> dp = new ArrayList<>(tri.get(n-1));
        for(int i=n-2; i>=0; i--) {
            for(int j=0; j<tri.get(i).size(); j++) {
                int curr = Math.min(dp.get(j), dp.get(j+1)) + tri.get(i).get(j);
                dp.set(j, curr);
            }
        }
        return dp.get(0);
    }
}
