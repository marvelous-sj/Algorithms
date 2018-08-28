package xyz.marsj.test;

import xyz.marsj.listnode.ListNode;
/**
 * 反转链表（指定位置）
 * @author sj
 *
 */
public class ReverserLinkedList {
	public ListNode reverserLinkedList(ListNode head,int l,int r){
		ListNode dummyhead=new ListNode(-1);
		dummyhead.next=head;
		ListNode firstNode=dummyhead;
		for(int i=0;i<l-1;i++){
			firstNode=firstNode.next;
		}
		ListNode curNode=firstNode.next;
		ListNode lastNode=curNode;
		ListNode preNode=null;
		for(int i=l;i<=r;i++){
			ListNode nextNode =curNode.next;
			curNode.next=preNode;
			preNode=curNode;
			curNode=nextNode;
		}
		firstNode.next=preNode;
//	 	多余
//		if(curNode==null){
//			lastNode.next=null;
//		}else{
//			lastNode.next=curNode;
//		}
		lastNode.next=curNode;
		return dummyhead.next;
	}
	public static void main(String[] args) {
		ReverserLinkedList reverse=new ReverserLinkedList();
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next=new ListNode(6);
		ListNode listNode = reverse.reverserLinkedList(head, 1, 6);
		while(listNode!=null){
			System.out.println(listNode.val);
			listNode=listNode.next;
		}
		String a=new String("dd");
		a.length();
	}
}
