// Find the largest element an Arrays
import java.util.Arrays;
public class ArraysLargest {
    public static void main(String[]args){
        // Method 1: Declare and initialize together
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};

        // Normal Method (Direct Assignment)
        int largest = Numbers[0];
        
        if(Numbers[1] > largest) largest = Numbers[1];
        if(Numbers[2] > largest) largest = Numbers[2];
        if(Numbers[3] > largest) largest = Numbers[3];
        if(Numbers[4] > largest) largest = Numbers[4];
        if(Numbers[5] > largest) largest = Numbers[5]; 
        if(Numbers[6] > largest) largest = Numbers[6];
        if(Numbers[7] > largest) largest = Numbers[7];
        if(Numbers[8] > largest) largest = Numbers[8];
        if(Numbers[9] > largest) largest = Numbers[9];
        
        System.out.println("Largest Element is: "+largest);  
        
        // Using an For Loop Method.
        largest = Numbers[0];
        for (int i = 1; i < Numbers.length; i++) {
            if (Numbers[i] > largest) {
                largest = Numbers[i];
            }
        }
        System.out.println("Largest Element is: "+largest);


        // Using an In-built Method
        int largest1 = Arrays.stream(Numbers).max().getAsInt();
        System.out.println("Largest Element is: "+largest);
    }
}
