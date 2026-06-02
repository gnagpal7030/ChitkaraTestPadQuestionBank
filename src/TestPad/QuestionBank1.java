package TestPad;

public class QuestionBank1 {

    public static long power(int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException("Negative exponent not allowed");
        }

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    void sumOfAllDigitsRecursion(int n) {
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }


}
