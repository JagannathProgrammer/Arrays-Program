
// Print an Array in Reverse Order
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};

        // 1. Normal Method (Without a Loop)
        // Manually arrange in reverse order
        System.out.println("Reverse Order:");
        System.out.println(
            Numbers[9] + " " + Numbers[8] + " " + 
            Numbers[7] + " " + Numbers[6] + " " + 
            Numbers[5] + " " + Numbers[4] + " " +
            Numbers[3] + " " + Numbers[2] + " " +
            Numbers[1] + " " + Numbers[0]
        );

        // 2. For Loop Method (Automatic Reverse Order)
        System.out.print("Reverse Order: ");
        for (int i = Numbers.length - 1; i >= 0; i--) {
            System.out.print(Numbers[i] + " ");
        }
        System.out.println();

        // 3. In-built Method (Collections.reverse())
        // Convert int[] to a List<Integer>
        List<Integer> list = new ArrayList<>();
        for (int num : Numbers) {
            list.add(num);
        }
        // Reverse the list
        Collections.reverse(list);
        // Print the reversed list
        System.out.println("Reverse Order:");
        System.out.println(list);

        
    }
    
}
