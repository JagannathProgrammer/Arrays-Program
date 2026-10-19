
// Sort an Array in Ascending Order
import java.util.Arrays;
public class SortingAscendingOrder {
    public static void main(String[] args) {
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};
        
        // 1. Normal Method (Without a Loop)
        // Manually arrange in ascending order
        int[] Assending = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Assending Order:");
        System.out.println(
            Assending[0] + " " + Assending[1] + " " + 
            Assending[2] + " " + Assending[3] + " " + 
            Assending[4] + " " + Assending[5] + " " +
            Assending[6] + " " + Assending[7] + " " +
            Assending[8] + " " + Assending[9]
        );

        // 2. For Loop Method (Automatic Sorting)
        //int temp; // we can also declare temp variable outside the loop
        for (int i = 0; i < Numbers.length-1; i++) {
            for (int j = i + 1; j < Numbers.length; j++) {
                if (Numbers[i] > Numbers[j]) {
                    int temp = Numbers[i];
                    Numbers[i] = Numbers[j];
                    Numbers[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < Numbers.length; i++) {
            System.out.print(Numbers[i] + " ");
        }
        System.out.println();

        // 3. In-built Method (Arrays.sort())
        // Sort array in ascending order
        Arrays.sort(Numbers);
        System.out.println("Ascending Order:");
        System.out.println(Arrays.toString(Numbers));
    }
}
