
//Count the Frequency of Each Element
import java.util.HashMap;
import java.util.Map;
public class Frequency {
    public static void main(String[] args) {
        int[] Numbers = {10, 20, 10, 30, 10, 20};

        // 1. Normal Method (Without a Loop)
        System.out.println("Element Frequency:");   
        // Manually check the known positions
        int count10 = 
        (Numbers[0] == 10 ? 1 : 0) +
        (Numbers[1] == 10 ? 1 : 0) +
        (Numbers[2] == 10 ? 1 : 0) +
        (Numbers[3] == 10 ? 1 : 0) +
        (Numbers[4] == 10 ? 1 : 0) +
        (Numbers[5] == 10 ? 1 : 0);
        System.out.println("10 = " + count10 + " times");

        int count20 =
        (Numbers[0] == 20 ? 1 : 0) +
        (Numbers[1] == 20 ? 1 : 0) +
        (Numbers[2] == 20 ? 1 : 0) +
        (Numbers[3] == 20 ? 1 : 0) +
        (Numbers[4] == 20 ? 1 : 0) +
        (Numbers[5] == 20 ? 1 : 0);
        System.out.println("20 = " + count20 + " times");

        int count30 =
        (Numbers[0] == 30 ? 1 : 0) +
        (Numbers[1] == 30 ? 1 : 0) +
        (Numbers[2] == 30 ? 1 : 0) +
        (Numbers[3] == 30 ? 1 : 0) +
        (Numbers[4] == 30 ? 1 : 0) +
        (Numbers[5] == 30 ? 1 : 0);
        System.out.println("30 = " + count30 + " times");

        // 2. For Loop Method (Automatic)
        boolean[] visited = new boolean[Numbers.length];
        System.out.println("Element Frequency:");

        for (int i = 0; i < Numbers.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < Numbers.length; j++) {
                if (Numbers[i] == Numbers[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(Numbers[i] + " = " + count + " times");
        }

        // 3. In-built Method (HashMap)
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : Numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }   

        System.out.println("Element Frequency:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue() + " times");
        }
    }    
}
