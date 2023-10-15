package LinkedLIst.Leetcode;

public class RemoveDuplicatesfromlist {
    /*Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
    Return the linked list sorted as well.

        Input: head = [1,1,2]
        Output: [1,2]

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        while(current !=null && current.next !=null ){
            //Method 1;
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }

            *//* Method 2:

            while (current.next !=null && current.val == current.next.val){
                    current.next = current.next.next;
                }
                current = current.next; *//*
        }
        return head;
    }*/
}
