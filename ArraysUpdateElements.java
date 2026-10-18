// One-dimensional array
// 1: Update an Value in specific index Position

import java.util.Arrays;
public class ArraysUpdateElements {
    public static void main(String[] args) {
         // Method 1: Declare and initialize together
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};
        
        // Normal Method (Direct Assignment)
        System.out.println("Index Position: 5 Value: "+ Numbers[5]);
        Numbers[5]=200;
        System.out.println("Index Position: 5 Updated Value: "+ Numbers[5]);
        System.out.println();

        // Using an For Loop Method.
        int index = 5;
        int NewValue = 400;

        for (int i = 0; i < Numbers.length; i++){
            System.out.print(Numbers[i]+", ");

            if ( i == index){
                Numbers[i] = NewValue;
            }
        }
        System.out.println();
        for (int i = 0; i < Numbers.length; i++){
            System.out.print(Numbers[i]+", ");
        }
        System.out.println();
            

        // Using an In-built Method
        Numbers[5] = 600;
        System.out.println("Updated Valu: "+ Arrays.toString(Numbers));
    }
}
