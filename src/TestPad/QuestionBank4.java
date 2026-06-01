package TestPad;

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

   //  https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
    void findMissingNumber(){}

    // Fibonacci Sequence using recursion - print in reverse order.

}
