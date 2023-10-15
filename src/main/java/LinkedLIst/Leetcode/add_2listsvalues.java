package LinkedLIst.Leetcode;

public class add_2listsvalues {
/*    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while (l1 != null || l2 != null){

            // if two lists given with different length then put zero at the end of list to match each with their length (edge case)
            int l1_val = (l1 !=null) ? l1.val :0;
            int l2_val = (l2 !=null) ? l2.val :0;


            int sum = l1_val + l2_val + carry ;
            // to find quotient (carrry) of the number

            carry = sum/10; // 4+6 =10 /10 = 1
            int remaining_digit = sum % 10 ; // 4+6 = 0(remaning digit) ,carry =1

            ListNode new_node = new ListNode(remaining_digit);
            temp.next = new_node;
            if(l1 !=null) l1 =l1.next;
            if(l2 !=null) l2 =l2.next;

            temp = temp.next;
        }
        if(carry>0){
            ListNode carry_node = new ListNode(carry);
            temp.next = carry_node;
            temp = temp.next;
        }
        return dummy.next;
    }*/
}
