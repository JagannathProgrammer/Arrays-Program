// Find the smallest element an Arrays.
public class ArraysSmallest {
    public static void main(String[] args) {
        // Method 1: Declare and initialize together
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};

        // Normal Method (Direct Assignment)
        int smallest = Numbers[0];
        
        if(Numbers[1] < smallest) smallest = Numbers[1];
        if(Numbers[2] < smallest) smallest = Numbers[2];
        if(Numbers[3] < smallest) smallest = Numbers[3];
        if(Numbers[4] < smallest) smallest = Numbers[4];
        if(Numbers[5] < smallest) smallest = Numbers[5]; 
        if(Numbers[6] < smallest) smallest = Numbers[6];
        if(Numbers[7] < smallest) smallest = Numbers[7];
        if(Numbers[8] < smallest) smallest = Numbers[8];
        if(Numbers[9] < smallest) smallest = Numbers[9];
        
        System.out.println("Smallest Element is: "+smallest);  
        
        // Using an For Loop Method.
        smallest = Numbers[0];
        for (int i = 1; i < Numbers.length; i++) {
            if (Numbers[i] < smallest) {
                smallest = Numbers[i];
            }
        }
        System.out.println("Smallest Element is: "+smallest);

        // Using an In-built Method
        int smallest1 = java.util.Arrays.stream(Numbers).min().getAsInt();
        System.out.println("Smallest Element is: "+smallest1);
    }
}
