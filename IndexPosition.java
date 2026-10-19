// Arrays Index Position and Value.
import java.util.stream.IntStream;

public class IndexPosition {
    public static void main(String[] args) {
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};

        // Using an Normal Method. (Direct Assignment)
        System.out.println("Index Position: 0 Elements: " +Numbers[0]);
        System.out.println("Index Position: 1 Elements: " +Numbers[1]);
        System.out.println("Index Position: 2 Elements: " +Numbers[2]);
        System.out.println("Index Position: 3 Elements: " +Numbers[3]);
        System.out.println("Index Position: 4 Elements: "+ Numbers[4]);
        System.out.println("Index Position: 5 Elements: "+ Numbers[5]);
        System.out.println("Index Position: 6 Elements: "+ Numbers[6]);
        System.out.println("Index Position: 7 Elements: "+ Numbers[7]);
        System.out.println("Index Position: 8 Elements: "+ Numbers[8]);
        System.out.println("Index Position: 9 Elements: "+ Numbers[9]);
        System.out.println();

        // Using an For loop
        for (int i=0; i<Numbers.length; i++){
            System.out.println("Index Position: " + i + " Value: "+ Numbers[i]);
        }
        System.out.println();
        
        // Using an In-built Method
        IntStream.range(0, Numbers.length)
        .forEach(i-> System.out.println("Index Position: "+ i + " Value: "+ Numbers[i]));

    }
}
