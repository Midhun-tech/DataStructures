package LinkedLIst.Leetcode;

public class palindrome {

    /*public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode previous = null;
        while(slow != null)
        {
            ListNode next_node = slow.next;
            slow.next = previous;
            previous = slow;
            slow = next_node;
        }
        ListNode lefthalf = head;
        ListNode righthalf = previous;

        while(righthalf != null){
            if(lefthalf.val != righthalf.val){
                return false;
            }
            lefthalf = lefthalf.next;
            righthalf = righthalf.next;
        }
        return true;
    }*/
}
