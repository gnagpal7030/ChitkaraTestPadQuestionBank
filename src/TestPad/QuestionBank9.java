package TestPad;

import java.util.*;

public class QuestionBank9 {

    public static boolean hasDuplicateMappings(Map<String, String> map) {
        if (map.size() <= 1) {
            return false;
        }

        Set<String> set = new HashSet<>();

        for (String value : map.values()) {
            if (set.contains(value)) {
                return true;
            }
            set.add(value);
        }

        return false;
    }

    // https://leetcode.com/problems/happy-number/description
    public int getNextNumber(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();

        while (n != 1 && !visited.contains(n)) {

            visited.add(n);
            n = getNextNumber(n);

        }

        return n == 1;

    }

    // Duplicate Queue Elements
    void duplicateQueue(Queue q) {
        int size = q.size();

        for (int i = 0; i < size; i++) {
            int x = q.poll();

            q.add(x);
            q.add(x);
        }
    }

    // https://leetcode.com/problems/implement-queue-using-stacks/description/
    void qusingstacks() {
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

    // Implement Queue using Linked List.
    // https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/1
    void queueusingLL() {
        // Node class
        class Node {
            int data;
            Node next;

            Node(int new_data) {
                data = new_data;
                next = null;
            }
        }

// Queue class
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

    // Reverse a given queue - in TestPad - already done.

    // https://ds1-iiith.vlabs.ac.in/exp/tree-traversal/reconstructing-binary-tree/from-inorder-and-postorder.html
}
