package xyz.marsj.listnode;
/** 19
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
	示例：
	给定一个链表: 1->2->3->4->5, 和 n = 2.
	当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * @author sj
 *
 */
public class RemoveNthFromEnd {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode dummyNode=new ListNode(-1);
	        dummyNode.next=head;
	        ListNode p=dummyNode;
	        ListNode q=dummyNode;
	        for(int i=0;i<=n;i++){
	        p=p.next;
	        }
	        while(p!=null){
	            p=p.next;
	            q=q.next;
	        }
	        q.next=q.next.next;
	        return dummyNode.next;
	    }
}
