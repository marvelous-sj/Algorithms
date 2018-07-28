package xyz.marsj.listnode;
/**82
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
	示例 1:
	输入: 1->2->3->3->4->4->5
	输出: 1->2->5
 * @author sj
 *
 */
public class DeleteDuplicates2 {
	  public ListNode deleteDuplicates(ListNode head) {
		  	ListNode dummyNode=new ListNode(-1);
		     dummyNode.next=head;
		     head=dummyNode;
		     ListNode pre=head;
		     ListNode cur=head.next;
		     while(cur!=null&&cur.next!=null){
		    	 if(cur.val!=cur.next.val){
		    		 if(pre.next==cur){
		    			 pre=cur;
		    		 }else{
		    			 pre.next=cur.next;
		    		 }
		    	 }
		    	 cur=cur.next;
		     }
		     
		     if(pre.next!=cur){
		    	 pre.next=null;
		     }
			return dummyNode.next;
	    }
}
