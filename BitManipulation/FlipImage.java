package Vansh.BitManipulation;

public class FlipImage {

    public static int[][] flipAndInverImage(int[][] image) {
        for(int row[] : image) {
            for(int i=0; i<image[0].length /2; i++) {
                //swap and xor with 1
                int temp = row[i]^1;
                row[i] = row[image[0].length-i-1]^1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    } 

    static void printArray(int[][] image) {
        for(int row[] : image) {
            for(int i=0; i<image[0].length; i++) {
                System.out.print(row[i]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,1,0}} ;
        flipAndInverImage(image);
        printArray(image);
    }
}
