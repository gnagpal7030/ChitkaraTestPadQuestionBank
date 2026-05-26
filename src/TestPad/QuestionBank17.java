package TestPad;

public class QuestionBank17 {

    // Linked List

    // https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1
    public void rotateLinkedList(){
        int totalLength = 1;

        // make list circular
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
            totalLength++;
        }

        k = k % totalLength;

        if(k == 0){
            return head;
        }

        curr.next = head;

        curr = head;

        for(int i = 1; i < k; i++){
            curr = curr.next;
        }

        Node newHead = curr.next;
        curr.next = null;
        return newHead;
    }

    // https://leetcode.com/problems/reverse-nodes-in-k-group/description/
    public void reverseKNodesInLL(){
        ListNode getKthNode(ListNode curr, int k) {
            while (curr != null && k > 0) {
                curr = curr.next;
                k--;
            }
            return curr;
        }

        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode dummy = new ListNode();
            dummy.next = head;

            // Pointer to the tail of the last reversed group
            ListNode groupPrev = dummy;

            while (true) {
                // Get the k-th node in the current group
                ListNode kth = getKthNode(groupPrev, k);
                if (kth == null)
                    break;

                // Store the next group’s head
                ListNode groupNext = kth.next;

                // Reverse the current k-group
                ListNode prev = groupNext;
                ListNode curr = groupPrev.next;

                for (int i = 0; i < k; i++) {
                    ListNode nextNode = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = nextNode;
                }

                // Connect the previous group to the reversed group
                ListNode temp = groupPrev.next;
                groupPrev.next = kth;
                groupPrev = temp;
            }

            // Return the new head
            return dummy.next;
    }

    // https://leetcode.com/problems/reverse-linked-list/description/
    public void reverseLL(){}

    // https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
    public void intersectionTwoSortedLL(){

            Node dummy = new Node(0);
            Node temp = dummy;

            while(head1 != null && head2 != null){
                if(head1.data == head2.data){
                    Node newNode = new Node(head1.data);
                    temp.next = newNode;
                    temp = temp.next;
                    head1 = head1.next;
                    head2 = head2.next;
                } else if(head1.data < head2.data){
                    head1 = head1.next;
                }else{
                    head2 = head2.next;
                }
            }

            return dummy.next;}
    }

    // https://www.geeksforgeeks.org/problems/intersection-of-two-linked-list/1
    public void intersectionTwoLL(){
        // code here
        Node dummy = new Node(0);
        Node temp = dummy;

        // put second list nodes in the set
        Set<Integer> set = new HashSet();

        Node curr = head2;
        while(curr != null){
            set.add(curr.data);
            curr = curr.next;
        }


        curr = head1;
        // now create a new linked list of common nodes.
        while(curr != null){
            if(set.contains(curr.data)){
                Node newNode = new Node(curr.data);
                temp.next = newNode;
                temp = temp.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }

    // https://www.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/1
    public void removeDuplicateFromDoublyLL(){

        if(head == null || head.next == null){
            return head;
        }

        // remove duplicates
        Node temp = head;
        while(temp != null && temp.next != null){
            Node nextNode = temp.next;
            while(nextNode != null && temp.data == nextNode.data){
                nextNode = nextNode.next;
            }

            temp.next = nextNode;
            if(nextNode != null){
                nextNode.prev = temp;
            }
            temp = temp.next;
        }

        return head;
    }

    // Split the circular linked list in two parts - in TestPad

    // Given List is circular or not - in TestPad

    // Odd Even Re-arrangement of Nodes in DLL - in TestPad.

    // Rotate the LL by K elements

    // Trees

    // Print all paths to leaves and their details of a binary tree - testPad

    // Print nodes from top view of a tree - TestPad

    // Print all nodes in a given level in a binary tree. - TestPad.
}
