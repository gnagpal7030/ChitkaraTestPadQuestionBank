package TestPad;

public class QuestionBank15 {

    // https://www.geeksforgeeks.org/problems/implement-stack-using-array/1
    void ImplementStackUsingArray(){}

    //  https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?utm_source=chatgpt.com
    void DataCollectionCompany(){
        // code here
//        ArrayList<Integer> ans = new ArrayList<>();

        int n = height.length;

        Stack<Integer> st = new Stack<>();

        long sum = 0;

        for(int i = n - 1; i >= 0; i--) {

            // remove smaller or equal elements
            while(!st.isEmpty() && st.peek() <= height[i]) {
                st.pop();
            }

            // next greater element
            if(st.isEmpty()) {
//                ans.add(-1);
                sum += -1;
            } else {
                sum += st.peek();
//                ans.add(st.peek());
            }

            // push current element
            st.push(height[i]);
        }

         System.out.println(sum);
//        Collections.reverse(ans);
        return ans;
    }

    // https://www.geeksforgeeks.org/problems/count-the-reversals0401/1
    void MinimumBracketTraversal(){
        int n = s.length();

        // odd length can never be balanced
        if(n % 2 != 0) {
            return -1;
        }

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {

            // balanced pair found
            if(ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }

        int open = 0;
        int close = 0;

        while(!st.isEmpty()) {

            if(st.pop() == '{') {
                open++;
            } else {
                close++;
            }
        }

        return (open + 1) / 2 + (close + 1) / 2;
    }

    // https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
    void codeCompiler(){}

    // - No online/tespad presence
    void reverseQueuePrimePositions(){
            // function to check prime index
            static boolean isPrime(int n) {

                if (n < 2) {
                    return false;
                }

                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }

                return true;
            }

            static void changeQueueElements(Queue<Integer> q) {

            int size = q.size();

            Stack<Integer> st = new Stack<>();

            // Step 1:
            // collect prime indexed elements
            for (int i = 0; i < size; i++) {

                int val = q.poll();

                if (isPrime(i)) {
                    st.push(val);
                }

                q.offer(val);
            }

            // Step 2:
            // rebuild queue
            for (int i = 0; i < size; i++) {

                int val = q.poll();

                if (isPrime(i)) {
                    q.offer(st.pop());
                } else {
                    q.offer(val);
                }
            }
        }
    }

//    https://leetcode.com/problems/merge-two-sorted-lists/
//    Move smallest and largest - TestPad
}
