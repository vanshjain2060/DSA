import java.util.*;

public class ExpertTeamDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(getMaxExpertValue(A));
    }

    // Returns the maximum expert number that can be obtained
    public static int getMaxExpertValue(int[] arr) {
        int n = arr.length, maxSum = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : arr) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i)+1);
        }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        if(!map.containsKey(0)) return 0;
        int freq = 0;
        int curr = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey(), val = entry.getValue();
            if(key == 0) {
                freq = val;
                continue;
            }
            if(key != curr) break;
            else {
                if(freq > val) {
                    maxSum += (curr * (freq - val));
                    freq = val;
                }
                curr++;
            }
        }
        maxSum += (curr * freq);
        return maxSum;
    }
}