
// Merge Two Arrays Into a Single Array 
import java.util.Arrays;
public class Merge {
    public static void main(String[] args) {
        int[] Array1 = {10, 20, 30, 40, 50};
        int[] Array2 = {60, 70, 80, 90, 100};

        int[] merged = new int[10];

         // Copy elements from first array
         merged[0] = Array1[0];
         merged[1] = Array1[1];
         merged[2] = Array1[2];
         merged[3] = Array1[3];
         merged[4] = Array1[4];

         // Copy elements from second array
         merged[5] = Array2[0];
         merged[6] = Array2[1];
         merged[7] = Array2[2];
         merged[8] = Array2[3];
         merged[9] = Array2[4];

         // Print merged array without a loop
         System.out.print("Mergrd Array: ");
         System.out.print(merged[0]+", ");
         System.out.print(merged[1]+", ");
         System.out.print(merged[2]+", ");
         System.out.print(merged[3]+", ");
         System.out.print(merged[4]+", ");
         System.out.print(merged[5]+", ");
         System.out.print(merged[6]+", ");
         System.out.print(merged[7]+", ");
         System.out.print(merged[8]+", ");
         System.out.println(merged[9]);


         // 2. For Loop Method (Automatic Sorting)
         int[] merged1 = new int[Array1.length + Array2.length];

         // // Copy the first array
         for (int i = 0; i < Array1.length; i++) {
             merged1[i] = Array1[i];
         }

         // Copy the second array
         for (int i = 0; i < Array2.length; i++) {
                merged1[Array1.length + i] = Array2[i];
            }

            System.out.print("Merged Array using For Loop: ");
            for (int i = 0; i < merged1.length; i++) {
                System.out.print(merged1[i] + " ");
            }
            System.out.println();

            // 3. In-built Method (System.arraycopy())
            int[] merged2 = new int[Array1.length + Array2.length];

            System.arraycopy(Array1, 0, merged2, 0, Array1.length); 
            System.arraycopy(Array2, 0, merged2, Array1.length, Array2.length);
            
            System.out.println("Merged Array : " + Arrays.toString(merged2));   
    }
}
        


