
// One-dimensional array
// 1: Declare and initialize an array
public class Arrays {
    public static void main(String[] args) {
        // Method 1: Declare and initialize together
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};

        // Method 2: Declare first, initialize later
        int[] Numbers1;
        Numbers1 = new int[]{10,20, 30, 40, 50, 100, 90, 80, 70, 60};

        // Method 3: Create an array with a fixed size
        int[] Numbers2 = new int[10];
        Numbers2[0] = 10;
        Numbers2[1] = 20;
        Numbers2[2] = 30;
        Numbers2[3] = 40;
        Numbers2[4] = 50;
        Numbers2[5] = 100;
        Numbers2[6] = 90;
        Numbers2[7] = 80;
        Numbers2[8] = 70;
        Numbers2[9] = 60;


        // Method 1: Print all elements Normaly.
        System.out.print("Array Numbers are: "+Numbers[0]);
        System.out.print(", "+Numbers[1]);
        System.out.print(", "+Numbers[2]);
        System.out.print(", "+Numbers[3]);
        System.out.print(", "+Numbers[4]);
        System.out.print(", "+Numbers1[5]);
        System.out.print(", "+Numbers1[6]);
        System.out.print(", "+Numbers1[7]);
        System.out.print(", "+Numbers1[8]);
        System.out.print(", "+Numbers1[9]);
        System.out.println();

        // Method 2: Print all elements using a for loop
        for (int i = 0; i<Numbers1.length; i++){
            System.out.println("Arrays Numbers1 are: "+Numbers1[i]);
        }
        System.out.println();

        // Method 3: Arrays in-Built method
        System.out.println("Arrays Numbers2 are: "+java.util.Arrays.toString(Numbers2));
    }
}
