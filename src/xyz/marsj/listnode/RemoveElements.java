package xyz.marsj.listnode;
/**203
 * 删除链表中等于给定值 val 的所有节点。
	示例:
	输入: 1->2->6->3->4->5->6, val = 6
	输出: 1->2->3->4->5
 * @author sj
 *
 */
public class RemoveElements {
	public ListNode removeElements(ListNode head, int val) {
        ListNode vNode=new ListNode(-1);
        vNode.next=head;
        head=vNode;
        while(head.next!=null){
            if(head.next.val==val){
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return vNode.next;
    }
}
