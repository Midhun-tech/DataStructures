package LinkedLIst.Leetcode;

public class reorderlist {

/*    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //To get the center node
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverese the nodes from center
        ListNode previous = null;
        while(slow != null)
        {
            ListNode next_node = slow.next;
            slow.next = previous;
            previous = slow;
            slow = next_node;
        }

        //Adding the left half and right half (reverse nodes) in to dummy linked list
        ListNode lefthalf = head;
        ListNode righthalf = previous;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (lefthalf !=null && lefthalf.next !=null && righthalf != null){

            temp.next = lefthalf;
            lefthalf = lefthalf.next;
            temp = temp.next;

            temp.next = righthalf;
            righthalf = righthalf.next;
            temp = temp.next;

        }
    }*/
}
