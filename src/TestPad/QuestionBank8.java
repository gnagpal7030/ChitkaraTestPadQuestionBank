package TestPad;

public class QuestionBank8 {

    void FlipOddElementsQueue() {
        Stack<Integer> stack = new Stack<>();
        int n = q.size();

        // Store odd-indexed elements in stack
        for (int i = 0; i < n; i++) {
            int val = q.poll();

            if (i % 2 == 1) {
                stack.push(val);
            }

            q.offer(val);
        }

        // Rebuild queue
        for (int i = 0; i < n; i++) {
            int val = q.poll();

            if (i % 2 == 0) {
                q.offer(val);           // even positions unchanged
            } else {
                q.offer(stack.pop());   // odd positions reversed
            }
        }
    }

    int MissingElementSum() {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : A) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : B) {
            freq.put(num, freq.get(num) - 1);
        }

        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();

            while (count-- > 0) {
                sum += value;
            }
        }

        return sum;
    }


//    https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

//    https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

    // Same as Longest Subarray with sum 0
    void NetProfitZero() {
    }

    // Implement Queue using 2 stacks - https://leetcode.com/problems/implement-queue-using-stacks/description/

//    https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/1

//    https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1


}


