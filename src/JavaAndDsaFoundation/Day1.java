package JavaAndDsaFoundation;

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
            System.out.println("Num" + num);
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
            System.out.println("Minor");
        }   // output - Adult


        // IF-ELSE-IF STATEMENT
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        }else {
            System.out.println("C");
        } // output - B


        // SWITCH STATEMENT (for multiple conditions based on a value (support int, string, enum))
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the Week");
                break;
            case "Friday":
                System.out.println("End of the week");
                break;
            default:
                System.out.println("Midweek");
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

        System.out.println(scores[0]); // output : 90 (0-based index)
        scores[1] = 88; // update element

        // REVERSE AN ARRAY (we can reverse in-place(without extra space) by swapping elements from start and end)

    }



}
