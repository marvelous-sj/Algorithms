package xyz.marsj.listnode;

/** 24
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
	示例:
	给定 1->2->3->4, 你应该返回 2->1->4->3.
 * @author sj
 *
 */
public class SwapPairs {
	 public ListNode swapPairs(ListNode head) {
	        ListNode dummyNode=new ListNode(-1);
	        dummyNode.next=head;
	        
	        ListNode pre=dummyNode;
	        while(pre.next!=null&&pre.next.next!=null){
	        	ListNode node1 =pre.next;
	        	ListNode node2=node1.next;
	        	ListNode next=node2.next;
	        	node2.next=node1;
	        	pre.next=node2;
	        	node1.next=next;
	        	pre=node1;
	        }
	        return dummyNode.next;
	    }
}
