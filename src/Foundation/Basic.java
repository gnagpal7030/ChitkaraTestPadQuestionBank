package Foundation;

public class Basic {

    public static void PracticeBasic(){
        // Swapping Two Variables
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Decision Statements
        boolean valueToBeEvaluated = false;
        int n = 10;
        if(valueToBeEvaluated){
            System.out.println("If Block");
        }else if(n > 10){
            System.out.println("Else if Block");
        }else{
            System.out.println("Else Block");
        }

        // Ternary Operator
        String result = n > 10 ? "n is greater than 10" : "n is smaller than or equal to 10";
        System.out.println(result);

        // Loops - While, For Loop
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        for(int k = 1; k <= 5; k++){
            System.out.println(k);
        }

        int j = 1;
        for(;j <= 5;){
            System.out.println(j);
            j++;
        }

        // Reverse a given number
        // Check if the number is palindrome or not.

        // Nested Loops
        // Pattern 1, 2

        // Arrays


        // Methods
    }



}
