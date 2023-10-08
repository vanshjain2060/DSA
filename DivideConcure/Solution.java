package Vansh.DivideConcure;
import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        int i=0 , j=0;
        List<Integer> List = new ArrayList<>();
        while(i<a.length && j<b.length) {
            if(a[i] == b[j]){ List.add(a[i]);
                System.out.println(a[i]); i++ ; j++;}
            else if(a[i] < b[j]) {
                System.out.println(a[i]);
                List.add(a[i]);
                i++;
            } 
            else if(a[i] > b[j]) {
                System.out.println(b[j]);
                List.add(b[j]);
                j++;
            } 
        }
        while(i<a.length) List.add(a[i++]);
        while(j<b.length) List.add(b[j++]);
        return List;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,3};
        int b[] = {2,2};
        System.out.println(sortedArray(a, b));
    }
}