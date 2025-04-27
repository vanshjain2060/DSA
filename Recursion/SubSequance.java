import java.util.ArrayList;
import java.util.List;

public class SubSequance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> list1 = new ArrayList<>();
        getSubSequence1(0, arr, new ArrayList<>(), list1);
        System.out.println(list1);
        
        List<List<Integer>> list2 = new ArrayList<>();
        getSubSequence2(0, arr, new ArrayList<>(), list2);
        System.out.println(list2);

        List<List<Integer>> list3 = new ArrayList<>();
        getSubSequence3(arr, list3);
        System.out.println(list3);
    }

    public static void getSubSequence1(int i, int arr[], List<Integer> curr, List<List<Integer>> list) {
        if (i >= arr.length) {
            list.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[i]);
        getSubSequence1(i + 1, arr, curr, list);
        curr.remove(curr.size() - 1);
        getSubSequence1(i + 1, arr, curr, list);
    }

    public static void getSubSequence2(int i, int[] arr, List<Integer> curr, List<List<Integer>> list) {
        list.add(new ArrayList<>(curr));
        if (i >= arr.length) return;

        for (int j = i; j < arr.length; j++) {
            curr.add(arr[j]);
            getSubSequence1(j + 1, arr, curr, list);
            curr.remove(curr.size() - 1);
        }
    }

    public static void getSubSequence3(int[] arr, List<List<Integer>> list) {
        for(int mask = 1; mask <= (1<<arr.length); mask++) {
            List<Integer> curr = new ArrayList<>();
            for(int j=0; j<arr.length; j++) {
                if((mask & (1 << j)) > 0) {
                    curr.add(arr[j]);
                }
            }
            list.add(curr);
        }
    }
}
