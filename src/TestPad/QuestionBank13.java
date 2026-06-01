package TestPad;

public class QuestionBank13 {

    void sortedUnionOfSortedTwoLL(){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        ListNode p1 = head1;
        ListNode p2 = head2;

        while (p1 != null && p2 != null) {
            int valueToAppend;

            if (p1.val < p2.val) {
                valueToAppend = p1.val;
                p1 = p1.next;
            } else if (p2.val < p1.val) {
                valueToAppend = p2.val;
                p2 = p2.next;
            } else { // Both are equal
                valueToAppend = p1.val;
                p1 = p1.next;
                p2 = p2.next;
            }

            // Append to tail only if it's the first element or avoids duplicate
            if (tail == dummy || tail.val != valueToAppend) {
                tail.next = new ListNode(valueToAppend);
                tail = tail.next;
            }
        }

        // Process remaining elements of List 1
        while (p1 != null) {
            if (tail == dummy || tail.val != p1.val) {
                tail.next = new ListNode(p1.val);
                tail = tail.next;
            }
            p1 = p1.next;
        }

        // Process remaining elements of List 2
        while (p2 != null) {
            if (tail == dummy || tail.val != p2.val) {
                tail.next = new ListNode(p2.val);
                tail = tail.next;
            }
            p2 = p2.next;
        }

        return dummy.next;
    }
}
