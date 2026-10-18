// Sort an Array in Ascending Order
import java.util.Arrays;
public class ArraysSorting {
    public static void main(String[] args) {
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};
        int temp;

        // For Loop Method (Bubble Sort)
        for (int i = 0; i < Numbers.length-1; i++) {
            for (int j = 0; j < Numbers.length-1-i; j++) {
                if (Numbers[j] > Numbers[j+1]) {
                    temp = Numbers[j];
                    Numbers[j] = Numbers[j+1];
                    Numbers[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array in Ascending Order: ");
        for (int n: Numbers) {
            System.out.print(n + " ");
        }
        System.out.println();



        // Using an In-built Method
        Arrays.sort(Numbers);
        System.out.print("Sorted Array in Ascending Order: "+ Arrays.toString(Numbers));
    }
}
