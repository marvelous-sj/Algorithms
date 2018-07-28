package xyz.marsj.listnode;

public class OddEvenList {
	   public ListNode oddEvenList(ListNode head) {
		   if(head==null){
			   return null;
		   }
	        ListNode odd=head;
	        ListNode even=head.next;
	        ListNode evenHead=even;
	        while(even!=null&&even.next!=null){
	        	odd.next=even.next;
	        	even.next=even.next.next;
	        	odd=odd.next;
	        	even=even.next;
	        }
	        odd.next=evenHead;
	        return odd;
	    }
}
