package TestPad;

public class QuestionBank15 {

    // https://www.geeksforgeeks.org/problems/implement-stack-using-array/1
    void ImplementStackUsingArray() {
        class myStack {

            int size;
            int arr[];
            int top;

            public myStack(int n) {
                top = -1;
                arr = new int[n];
                size = n;
            }

            public boolean isEmpty() {
                if (top == -1) {
                    return true;
                }
                return false;

                //   return top == -1;
            }

            public boolean isFull() {
                if (top == size - 1) {
                    return true;
                }
                return false;
            }

            public void push(int x) {
                if (!isFull()) {
                    top = top + 1;
                    arr[top] = x;

                }
            }

            public void pop() {
                if (!isEmpty()) {
                    top--;
                }

            }

            public int peek() {
                if (!isEmpty()) {
                    return arr[top];

                }
                return -1;
            }
        }

    }

    //  https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?utm_source=chatgpt.com
    void DataCollectionCompany() {
        // code here
//        ArrayList<Integer> ans = new ArrayList<>();

        int n = height.length;

        Stack<Integer> st = new Stack<>();

        long sum = 0;

        for (int i = n - 1; i >= 0; i--) {

            // remove smaller or equal elements
            while (!st.isEmpty() && st.peek() <= height[i]) {
                st.pop();
            }

            // next greater element
            if (st.isEmpty()) {
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
    void MinimumBracketTraversal() {
        int n = s.length();

        // odd length can never be balanced
        if (n % 2 != 0) {
            return -1;
        }

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // balanced pair found
            if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        int open = 0;
        int close = 0;

        while (!st.isEmpty()) {

            if (st.pop() == '{') {
                open++;
            } else {
                close++;
            }
        }

        return (open + 1) / 2 + (close + 1) / 2;
    }

    // https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            // closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // no matching opening bracket
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                // mismatch check
                if (
                        (ch == ')' && top != '(') ||
                                (ch == '}' && top != '{') ||
                                (ch == ']' && top != '[')
                ) {
                    return false;
                }
            }
        }

        // extra opening brackets remaining
        if (!st.isEmpty()) {
            return false;
        }

        return true;
    }

    // - No online/tespad presence
    void reverseQueuePrimePositions() {
        // function to check prime index
        static boolean isPrime ( int n){

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

        static void changeQueueElements (Queue < Integer > q) {

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                ans.next = temp1;
                temp1 = temp1.next;
            } else {
                ans.next = temp2;
                temp2 = temp2.next;
            }
            ans = ans.next;
        }

        while (temp1 != null) {
            ans.next = temp1;
            ans = ans.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            ans.next = temp2;
            ans = ans.next;
            temp2 = temp2.next;
        }

        return dummy.next;
    }
//    Move smallest and largest - TestPad
}
