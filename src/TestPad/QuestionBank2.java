package TestPad;

import java.util.Scanner;

public class QuestionBank2 {

    public static int base6DigitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 6;
            n /= 6;
        }

        return sum;
    }

    static void  findInversions(String []arr, int n){

        int[] derived = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i].trim());
            derived[i] = base6DigitSum(num);
        }

        int inversions = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (derived[i] > derived[j]) {
                    inversions++;
                }
            }
        }

        System.out.println(inversions);
    }

    int maximumXorValuePair(int A, int B){
        int xor = A ^ B;
        int ans = 1;

        while (xor > 0) {
            ans <<= 1;
            xor >>= 1;
        }

        return ans - 1;
    }

    void ExceptionHandlingSafeDivision(){
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x / y);

        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        sc.close();
    }

    void ExceptionHandlingInJava(){} // - done

    void MyCalculatorException(){} // - done
}
