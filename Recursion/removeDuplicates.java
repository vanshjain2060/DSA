package Vansh.Recursion;

public class removeDuplicates {
    public static void removeDup(String str , int i , StringBuilder newStr , boolean map[]) {
        // Base Case
        if(i ==  str.length()){
            System.out.println(newStr);
            return;
        }
        // Kaam
        char currChar = str.charAt(i);
        if(map[currChar - 'a'] == true){ // case of duplicate
            removeDup(str, i+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDup(str, i+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "vanshjain";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}