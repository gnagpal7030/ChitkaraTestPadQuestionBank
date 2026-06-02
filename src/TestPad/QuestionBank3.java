package TestPad;

public class QuestionBank3 {

    // in testpad
    void findFactorial(int n){}

    // in testpad
    void reverseStringUsingRecursion(int n){}

    int findSumOfFirstAndLastDigitOfNumber(int n){

        int lastDigit = n % 10;

        while (n >= 10) {
            n /= 10;
        }

        int firstDigit = n;

        return firstDigit + lastDigit;
    }

    // valid email address - in TestPad



}
