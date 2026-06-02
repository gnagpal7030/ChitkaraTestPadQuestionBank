package TestPad;

public class QuestionBank5 {

    // Recurrence relations found.

    // Merge Two Sorted arrays - Descending order
    public static void mergeTwoSortedArrays(int []arr1, int []arr2){
        int m = arr1.length;
        int n = arr2.length;
        int []res = new int[m + n];

        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(arr1[i] > arr2[j]){
                res[k++] = arr1[i++];
            }else{
                res[k++] = arr2[j++];
            }
        }

        while(i < m){
            res[k++] = arr1[i++];
        }

        while(j < n){
            res[k++] = arr2[j++];
        }

        for(int r : res){
            System.out.println(r + " ");
        }
    }

    // Exception Handling Program
    public int countNumber(int[] q, int n) {
        long totalSum = 0;

        for (int num : q) {
            totalSum += num;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            long sumOthers = totalSum - q[i];

            try {
                if (sumOthers % q[i] == 0) {
                    count++;
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }

        return count;
    }

    // Assumption that MyException Class is Created
    public long power(int n, int p) throws MyException {

        if (n < 0 || p < 0) {
            throw new MyException("n or p should not be negative");
        }

        if (n == 0 && p == 0) {
            throw new MyException("n and p should not be zero");
        }

        return (long) Math.pow(n, p);
    }

    // Binary equivalent using recursion - in testPad.

    // Reverse a string using recursion - already done.

    // Count the number of Set Bits in an integer - in TestPad

    // Check kth bit is set or not - https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1
    static boolean checkKthBit(int n, int k) {
        // code here

        int bit = 0;
        while(k > 0){
            n = n >> 1;
            k--;
        }

        return (n & 1) == 1;
    }

    // print all bits with condition - https://www.geeksforgeeks.org/problems/generate-all-binary-strings/1
    void printAllBits(int n){
        public static void solve(int n, ArrayList<String> ans, String curr){
            if(n == 0){
                ans.add(curr);
                return;
            }

            // fill place with 0
            solve(n - 1, ans, curr + "0");

            // fill place with 1
            solve(n - 1, ans, curr + "1");
        }

        public ArrayList<String> binstr(int n) {
            // code here
            ArrayList<String> ans = new ArrayList<>();
            solve(n, ans, "");
            return ans;
        }
    }

    // kth bit is set
    static void generate(int idx, int n, int k, String ans) {
        if (idx == n) {
            System.out.println(ans);
            return;
        }

        if (idx == k) {
            generate(idx + 1, n, k, ans + "1");
        } else {
            generate(idx + 1, n, k, ans + "0");
            generate(idx + 1, n, k, ans + "1");
        }

        /*
        int n = 4;
        int k = 2;

        generate(0, n, k, "");
         */
    }

    // Print all strings of n size
    // https://www.geeksforgeeks.org/problems/generate-all-binary-strings/1

}
