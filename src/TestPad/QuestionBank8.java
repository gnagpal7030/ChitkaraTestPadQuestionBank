package TestPad;

import java.util.*;

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

    int MissingElementSum(int[] A, int[] B) {
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

            while (count > 0) {
                sum += value;
                count--;
            }
        }

        return sum;
    }


    //    https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
    public int maxLength(int[] arr) {
        int n = arr.length;

        // prefixSum -> first index
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        // insert prefix sum 0 at index -1
        // to handle sum from start
        prefixMap.put(0, -1);

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // prefix sum has been seen before
            if (prefixMap.containsKey(prefixSum)) { // x check
                int prevIndex = prefixMap.get(prefixSum);
                int length = i - prevIndex;
                maxLen = Math.max(maxLen, length);
            } else {
                // Store first occurrence of this prefix sum
                prefixMap.put(prefixSum, i);
            }
        }
        return maxLen;
    }

    //    https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int start = 0;
        int maxAns = 0;

        for (int end = 0; end < s.length(); end++) {

            if (!charSet.contains(s.charAt(end))) {
                maxAns = Math.max(maxAns, end - start + 1);
                charSet.add(s.charAt(end));
            } else {
                while (charSet.contains(s.charAt(end))) {
                    charSet.remove(s.charAt(start));
                    start++;
                }
                charSet.add(s.charAt(end));
            }

        }

        return maxAns;
    }

    // Same as Longest Subarray with sum 0
    void NetProfitZero() {
    }

    // Implement Queue using 2 stacks - https://leetcode.com/problems/implement-queue-using-stacks/description/
    void implementQ2Stacks() {
        class MyQueue {

            Stack<Integer> input;
            Stack<Integer> output;

            public MyQueue() {
                input = new Stack();
                output = new Stack();
            }

            public void push(int x) {
                input.push(x);
            }

            public int pop() {
                peek();
                return output.pop();
            }

            public int peek() {
                if (output.empty())
                    while (!input.empty())
                        output.push(input.pop());
                return output.peek();
            }

            public boolean empty() {
                return input.empty() && output.empty();
            }
        }

    }

    //    https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/1
    void implementQueueLL() {
        class myQueue {

            private Node front;
            private Node rear;
            private int count;

            public myQueue() {
                // Initialize your data members
                front = null;
                rear = null;
                count = 0;
            }

            public boolean isEmpty() {
                // check if the queue is empty
                if (front == null) {
                    return true;
                } else {
                    return false;
                }
            }

            public void enqueue(int x) {
                // Adds an element x at the rear of the queue.
                Node newNode = new Node(x);
                if (isEmpty()) {
                    front = newNode;
                    rear = newNode;
                } else {
                    rear.next = newNode;
                    rear = newNode;
                }
                count++;
            }

            public void dequeue() {
                // Removes the front element of the queue
                if (isEmpty()) return;
                front = front.next;
                count--;
                if (front == null) rear = null;
            }

            public int getFront() {
                // Returns the front element of the queue.
                // If queue is empty, return -1.
                return isEmpty() ? -1 : front.data;
            }

            public int size() {
                // Returns the current size of the queue.
                return count;
            }
        }
    }

    //    https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        if (k > n) {
            return q;
        }

        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        for (int i = 0; i < n - k; i++) {
            q.add(q.poll());
        }
        return q;


    }

}


