package Vansh.Arrays;

public class reverse_an_array {
    public static void reverse(int numbers[]){
     /*   int first=0;
        int last=(numbers.length-1);

    while(first<last){
        // code for swap
        int temp=numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;

         first++;
         last--;
      }*/

      // same code using for loop
      
      for(int first=0 , last=numbers.length-1 ; first<last ; first++ , last--){
        // swaping first with last 
        int temp=numbers[last];
         numbers[last] = numbers[first];
         numbers[first]=temp; 
      }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] +" ");
        }
     System.out.println();    
  }
}
