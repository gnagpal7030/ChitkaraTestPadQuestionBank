package TestPad;

import java.util.*;

public class QuestionBank4 {

    // Exception Handling Code
    public static void validateScore(String name, String scoreStr) {
        try {
            int score;

            try {
                score = Integer.parseInt(scoreStr);
            } catch (NumberFormatException e) {
                throw new Exception("d");
            }

            if (score < 0 || score > 100) {
                throw new Exception("s");
            }

            System.out.println("Correct");

        } catch (Exception e) {
            if (e.getMessage().equals("s")) {
                System.out.println("Score range invalid!");
            } else if (e.getMessage().equals("d")) {
                System.out.println("Score cannot be other than digits!");
            }
        }
    }

    public static long power(int num, int exp) throws CustomException {

        if (num < 0 || exp < 0) {
            throw new CustomException("Negative numbers not allowed");
        }

        if (num == 0 && exp == 0) {
            throw new CustomException("Both can never be zero");
        }

        return (long) Math.pow(num, exp);
    }


    // https://www.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/1
    void perm(){
        static void swap(StringBuilder s, int i, int j) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
        }

        public static void recurPermute(int index, StringBuilder s, ArrayList<String> res) {

            if (index == s.length()) {
                res.add(s.toString());
                return;
            }

            for (int i = index; i < s.length(); i++) {
                swap(s, index, i);

                // fix current position and recurse
                recurPermute(index + 1, s, res);

                // backtrack
                swap(s, index, i);
            }
        }

        public ArrayList<String> permutation(String s) {
            // code here
            ArrayList<String> res = new ArrayList<>();
            recurPermute(0, new StringBuilder(s), res);
            Collections.sort(res);
            return res;
        }
    }

   // Find the rightmost bit of a number - https://www.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1
   public static int getFirstSetBit(int n) {
       // code here
       int shiftCount = 0;

       if(n == 0){
           return -1;
       }

       while((n & 1) != 1){
           shiftCount++;
           n = n >> 1;
       }

       return shiftCount + 1;
   }


   //  https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
   int missingNum(int arr[]) {
       // code here
       int res = 0;

       for(int i = 0; i < arr.length; i++){
           res = res ^ arr[i] ^ i;
       }

       return res ^ arr.length ^ arr.length + 1;
   }

    // Fibonacci Sequence using recursion - print in reverse order.
    public static void printReverseFibonacci(int n) {
        if (n <= 0) {
            return;
        }

        int[] fib = new int[n];

        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fib[i] + " ");
        }
    }
}
