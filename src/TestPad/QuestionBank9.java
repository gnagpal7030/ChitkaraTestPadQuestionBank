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

    // Duplicate Queue Elements
    void duplicateQueue(Queue q){
        int size = q.size();

        for (int i = 0; i < size; i++) {
            int x = q.poll();

            q.add(x);
            q.add(x);
        }
    }

    // https://leetcode.com/problems/implement-queue-using-stacks/description/

    // Implement Queue using Linked List.
    // https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/1

    // Reverse a given queue - in TestPad - already done.

   // https://ds1-iiith.vlabs.ac.in/exp/tree-traversal/reconstructing-binary-tree/from-inorder-and-postorder.html
}
