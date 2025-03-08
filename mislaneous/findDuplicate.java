import java.util.*;
public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {11, 97 ,11 ,23 ,97 ,11};
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i) > 1) s.add(i);
        }
        for(int i : arr) {
            if(s.contains(i)) {list.add(i); s.remove(i);}
        }
        for(int i: list) {
            System.out.print(i + " ");
        }
    }
}
