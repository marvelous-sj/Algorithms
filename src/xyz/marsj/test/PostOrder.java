package xyz.marsj.test;
/**
 * 根据前序，中序遍历，计算出后序遍历
 * @author sj
 *
 */
public class PostOrder {
	public String postOrder(String preOrder,String inOrder){
		if(preOrder.isEmpty()){
			return "";
		}
		 char root=preOrder.charAt(0);
		 int rootIndex=inOrder.indexOf(root);
		 return postOrder(preOrder.substring(1,1+rootIndex), inOrder.substring(0, rootIndex))+
				postOrder(preOrder.substring(1+rootIndex), inOrder.substring(rootIndex+1))+
				root;
	}
	public static void main(String[] args) {
		PostOrder order=new PostOrder();
		String postOrder = order.postOrder("abdegcf","dbgeacf");
		System.out.println(postOrder);
	}
}
