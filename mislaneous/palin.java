package Vansh.mislaneous;

public class palin {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
     
        int left = 0;
        int right = s.length() - 1;
     
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
     
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } 
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
     
            return true;
        // edge case
//         if(str.isEmpty()) return true;
        
//         // for 2 pointer approach lets make 2 variable
//         int lp=0;
//         int rp=str.length()-1;

//         while(lp<rp) {
//             char lc = str.charAt(lp);
//             char rc = str.charAt(rp);
// // for skiping the character if it is other than letter or digit
//             if(!Character.isLetterOrDigit(lc)) lp++;
//             if(!Character.isLetterOrDigit(rc)) rp--;

// // checking for pallindrome (while ignore upper and lower case)
//             if(Character.toLowerCase(lc) != Character.toLowerCase(rc)) return false;
//             lp++;
//             rp--;
//         }
//         return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

         

