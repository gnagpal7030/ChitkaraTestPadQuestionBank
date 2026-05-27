package TestPad;

public class QuestionBank16 {

    // https://leetcode.com/problems/intersection-of-two-linked-lists/description/
    public void intersectionPointOfTwoLL(){
        ListNode t1 = headA;
        ListNode t2 = headB;

        while (t1 != t2) {
            t1 = t1 == null ? headB : t1.next;
            t2 = t2 == null ? headA : t2.next;
        }

        return t1;
    }

    // https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
    public void findNthNodeFromEndOfLL(){
        Node first = head;
        Node second = head;

        // Move first pointer k steps ahead
        for(int i = 0; i < k; i++) {

            // k > length of list
            if(first == null) {
                return -1;
            }

            first = first.next;
        }

        // Move both pointers
        while(first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    // https://leetcode.com/problems/middle-of-the-linked-list/description/
    public void findMiddleOfLL(){
        // first calculate the length of the LL

        // int length = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     temp = temp.next;
        //     length++;
        // }

        // int finalDest = length / 2;

        // temp = head;
        // while(finalDest > 0){
        //     temp = temp.next;
        //     finalDest--;
        // }

        // return temp;

        // Hare and the tortoise Method - slow and fast pointer method
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // slow moves one step
            fast = fast.next.next; // fast moves two step
        }

        return slow;

    }

    // https://leetcode.com/problems/linked-list-cycle-ii/description/
    public void findStartPointOfLoopInLL(){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        if(fast == null || fast.next == null){
            return null;
        }

        ListNode temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }

        return slow;
    }

    // Rotate the DLL by K elements - in TestPad
    // Count the number of nodes in Circular Linked List - in TestPad
    // Insert in a sorted Circular Linked List - in TestPad

    // Print Cousins of a binary Tree - in TestPad

    // https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
    public void findMaxAtEachLevelBT(){
        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int maxVal = Integer.MIN_VALUE;
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                maxVal = Math.max(maxVal, node.val);

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            res.add(maxVal);
        }

        return res;
    }

    // Swap Two Nodes in a DLL - in TestPad - done.

    // Print Nodes at Odd Level of a Binary Tree - in TestPad

    // Find if the list is circular or not - in TestPad
}
