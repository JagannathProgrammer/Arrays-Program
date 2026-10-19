
// Sort an Array in Ascending Order
import java.util.Arrays;
import java.util.Collections;
public class SortingDescendingOrder {
    public static void main(String[]srga){
        Integer[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};

        // 1. Normal Method (Without Using a Loop)
        // // Manually arrange the values in descending order.
        int[] Descending = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        System.out.println("Descending Order:");
        System.out.println(
            Descending[0] + " " + Descending[1] + " " + 
            Descending[2] + " " + Descending[3] + " " + 
            Descending[4] + " " + Descending[5] + " " +
            Descending[6] + " " + Descending[7] + " " +
            Descending[8] + " " + Descending[9]
        );

        // 2. For Loop Method (Automatic Sorting)
        // int temp; // we can also declare temp variable outside the loop
        for (int i = 0; i < Numbers.length-1; i++) {
            for (int j = i + 1; j < Numbers.length; j++) {
                if (Numbers[i] < Numbers[j]) {
                    int temp = Numbers[i];
                    Numbers[i] = Numbers[j];
                    Numbers[j] = temp;
                }
            }
        }
        System.out.print("Descending Order: ");
        for (int i = 0; i < Numbers.length; i++) {
            System.out.print(Numbers[i] + " ");
        }
        System.out.println();

        // 3. In-built Method (Arrays.sort())
        // Sort array in descending order
        Arrays.sort(Numbers, Collections.reverseOrder());
        System.out.println("Descending Order:");
        System.out.println(Arrays.toString(Numbers));
    }
}
