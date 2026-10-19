public class LinearSearch{
    public static void main(String[]args){
        int[] Numbers = {10, 20, 30, 40, 50, 100, 90, 80, 70, 60};

        // Normal Method (Direct Assignment)
        int search = 50;
        int index = -1;

        if (Numbers[0] == search) index = 0;
        else if (Numbers[1] == search) index = 1;
        else if (Numbers[2] == search) index = 2;
        else if (Numbers[3] == search) index = 3;
        else if (Numbers[4] == search) index = 4;
        else if (Numbers[5] == search) index = 5;
        else if (Numbers[6] == search) index = 6;
        else if (Numbers[7] == search) index = 7;
        else if (Numbers[8] == search) index = 8;
        else if (Numbers[9] == search) index = 9;
        
        if(index != -1){
            System.out.println("Element found at index: "+index);
        }else{
            System.out.println("Element not found in the array.");
        }

        // Using an For Loop Method.
        int search1 = 100;
        int index1 = -1;
        for(int i = 0; i < Numbers.length; i++){
            if(Numbers[i] == search1){
                index1 = i;
                break;
            }
        }
        if(index1 != -1){
            System.out.println("Element found at index: "+index1);
        }else{
            System.out.println("Element not found in the array.");
        }


        // Using an In-built Method
        int search2 = 90;
        boolean found = java.util.Arrays.stream(Numbers).anyMatch(n -> n == search2);
        if(found){
            System.out.println("Element found in the array.");
        }else{
            System.out.println("Element not found in the array.");
        }

        int index2 = -1;
        for(int i = 0; i < Numbers.length; i++){
            if(Numbers[i] == search2){
                index2 = i;
                break;
            }
        }
        if(index2 != -1){
            System.out.println("Element found at index: "+index2);
        }else{
            System.out.println("Element not found in the array.");
        }

    }
}