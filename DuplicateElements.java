
// Finding Duplicate Elements in the Array
import java.util.HashSet;   
public class DuplicateElements {
    public static void main(String[] args) {
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60, 10, 20, 30};

        //1. Normal Method (Without a Loop)
        System.out.println("Duplicate Elements:");
        // Manually check the known duplicate positions
        if(Numbers[0] == Numbers[10]) {
            System.out.println(Numbers[0]);
        }
        if(Numbers[1] == Numbers[11]) {
            System.out.println(Numbers[1]);
        }
        if(Numbers[2] == Numbers[12]) {
            System.out.println(Numbers[2]);
        }   

        //2. For Loop Method (Automatic)
        System.out.println("Duplicate Elements:");
        for (int i = 0; i < Numbers.length; i++) {
            for (int j = i + 1; j < Numbers.length; j++) {
                if (Numbers[i] == Numbers[j]) {
                    System.out.println(Numbers[i]);
                    break; // To avoid printing the same duplicate multiple times   
                }
            }
        }

        //3. In-built Method (Using a Set)
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Duplicate Elements:"); 
        for (int num : Numbers) {
            if (!set.add(num)) {
                System.out.println(num);
            }
        }   
    }
    
}
