package JavaAndDsaFoundation;

import java.util.Arrays;

public class Day1 {

    // JAVA BASICS (LOOPS, CONDITIONS & ARRAYS)

    public static void main(String[] args) {

         /*------ LOOPS -------*/


        // FORLOOP (used when you know the number of iterations in advance)
        for(int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i); // output 0 -> 4
        }


        // WHILELOOP (Runs as long as a condition is true (check condition b4 execution))
        int count = 0;
        while (count < 5) {

            System.out.println("count: " + count);
                count ++; // output 0 -> 4
        }


        // DO-WHILE LOOP (Similar to while but checks condition after execution)
        int num = 0;
        do {
            System.out.print("Num " + num);
            num++;
        } while (num < 5);  // output 0 -> 4



        // ENHANCED FOR LOOP (For-Each) (Great for iterating over Arrays or collections)
        int [] arr = {0, 1, 2, 3, 4};
        for (int element : arr) {
            System.out.println(element); // output 0 -> 4
        }


        /*--------- CONDITIONS  ------------*/
        // conditionals in java controls the flow based on boolean conditions


        // IF-ELSE STATEMENT
        int age = 20;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.print("Minor");
        }   // output - Adult


        // IF-ELSE-IF STATEMENT
        int score = 85;
        if (score >= 90) {
            System.out.print("A");
        } else if (score >= 80) {
            System.out.println("B");
        }else {
            System.out.print("C");
        } // output - B


        // SWITCH STATEMENT (for multiple conditions based on a value (support int, string, enum))
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the Week");
                break;
            case "Friday":
                System.out.print("End of the week");
                break;
            default:
                System.out.print("Midweek");
        } // output: start of the week


        // TERNARY OPERATOR (shorthand for simple if-else)
        int max = (5 > 3) ? 5 : 3;
        System.out.println(max); // output - 5



        /*-------- ARRAYS ----------*/
        // Arrays store fixed-size collections of elements of the same type


        // DECLARATION AND INITIALIZATION
        int [] numbers; // Declaration

        numbers = new int[5]; // Initialization (size 5, default values 0)

        // or combined
        int[] scores = {90, 85, 95}; // initialized with values

        System.out.print(scores[0]); // output : 90 (0-based index)
        scores[1] = 88; // update element

        // REVERSE AN ARRAY (we can reverse in-place(without extra space) by swapping elements from start and end)
        int [] arr2 = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr2.length - 1;

        while (left < right) {
            // swap
            int temp = arr2[left];
            arr2[left] = arr2[right];
            arr2[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr2)); // output : 5,4,3,2,1


        // MAXIMUM AND MINIMUM IN AN ARRAY (Initialize max/min)
        int[] arr3 = {10, 5, 20, 3, 15};
        if(arr3.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int max3 = arr3[0];
        int min3 = arr3[0];

        for (int i = 1; i<arr.length; i++){
            if (arr3[i] > max3) {
                max3 = arr3[i];
            } if (arr3[i] < min3) {
                min3 = arr3[i];
            }
        }

        System.out.println("Max3: " + max3 + "Min3: " + min3); // output: Max3: 20, Min3: 3


        // EVEN NUMBERS IN ARRAY
        int[] arr4 = {1, 2, 3, 4, 5, 6};
        int count4 = 0;
        for (int num4 : arr4){
            if (num4 % 2 == 0){
                count4++;
            }
        }
        System.out.println("Even count: " + count4); // output: 3


        // CHECK IF ARRAY IS SORTED (ASCENDING)
        int[] arr5 = {1, 3, 5, 7};
        boolean isSorted = true;
        for (int i =1; i<arr5.length; i++){
            if (arr5[i] < arr5[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Is Sorted: " + isSorted); // True


        // SUM OF ARRAY ELEMENTS WITH CONDITIONS(Sum all the elements greater than a given threshold)
        int[] arr6 = {5, 15, 20, 8};
        int threshold = 10;
        int sum = 0;
        for (int num6 : arr6){
            if (num6 > threshold) {
                sum += num6;
            }
        }
        System.out.println("Sum > " + threshold + ": " + sum); // output 35


        // ROTATE ARRAY LEFT BY ONE POSITION(Shift all elements left by one, 1st element becomes last)
        int [] arr7 = {10, 20, 30, 40, 50};
        if (arr7.length > 0){
            int first = arr7[0];
            for (int i = 1; i<arr7.length; i++){
                arr7[i -1] = arr7[i];
            }
            arr7[arr7.length - 1] = first;
        }
        System.out.println(Arrays.toString(arr7)); // output 20, 30, 40, 50, 10
    }

}
