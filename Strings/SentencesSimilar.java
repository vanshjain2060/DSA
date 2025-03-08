

public class SentencesSimilar {

    // Function to check if sentences are similar
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        // Split both sentences into words
        String[] arr1 = sentence1.split(" ");
        String[] arr2 = sentence2.split(" "); 

        // Determine the smaller and bigger array lengths
        int sml = Math.min(arr1.length, arr2.length);
        int big = Math.max(arr1.length, arr2.length);

        // Assign the smaller and bigger arrays
        String[] small = arr1.length == sml ? arr1 : arr2;
        String[] bigarr = arr1.length != sml ? arr1 : arr2;

        // Initialize pointers for comparison
        int si = 0, sj = sml - 1, bi = 0, bj = big - 1;

        // Compare the front of both arrays
        while (si <= sj && small[si].equals(bigarr[bi])) {
            si++;
            bi++;
        }

        // Compare the back of both arrays
        while (si <= sj && small[sj].equals(bigarr[bj])) {
            sj--;
            bj--;
        }

        // Print the pointers for visualization
        System.out.println("si: " + si + "  sj: " + sj);

        // Return whether all elements were successfully compared
        return si > sj;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example sentences
        String sentence1 = "of";
        String sentence2 = "A lot of words";

        // Call the function and print the result
        boolean result = areSentencesSimilar(sentence1, sentence2);
        System.out.println("Are the sentences similar? " + result);
    }
}
