package xyz.marsj.listnode;
/**92
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
	说明:
	1 ≤ m ≤ n ≤ 链表长度。
	示例:
	输入: 1->2->3->4->5->NULL, m = 2, n = 4
	输出: 1->4->3->2->5->NULL
 * @author sj
 *
 */

public class ReverseBetween {
	
	   public static ListNode reverseBetween(ListNode head, int m, int n) {
		   ListNode virNode=new ListNode(-1);
		   virNode.next=head;
		   head=virNode;
		   for(int i=1;i<m;i++){
			   head=head.next;
		   }
		   ListNode first=head;
		   ListNode last=head.next;
		   ListNode cur=last;
		   ListNode pre=null;
		   for(int i=m;i<=n;i++){
			   ListNode next = cur.next;
			   cur.next=pre;
			   pre=cur;
			   cur=next;
		   }
		   first.next=pre;
		   last.next=cur;
		   return virNode.next;
	    }
	   
	   public static void main(String[] args) {
		ListNode node =new ListNode(1);
		ListNode node1=new ListNode(2);
		ListNode node2=new ListNode(3);
		ListNode node3=new ListNode(4);
		ListNode node4=new ListNode(5);
		node.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		ListNode head = reverseBetween(node, 2, 4);
		while(head.next!=null){
			System.out.println(head);
		}
	}
}
