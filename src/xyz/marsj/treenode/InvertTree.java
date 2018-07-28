package xyz.marsj.treenode;
/**226
 * 翻转一棵二叉树。
	示例：
	输入：

     4
   /   \
  2     7
 / \   / \
1   3 6   9
	输出：

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 * @author sj
 *
 */
public class InvertTree {
	 public TreeNode invertTree(TreeNode root) {
	        if(root==null){
	            return null;
	        }
	        invertTree(root.left);
	        invertTree(root.right);
	        
	        
	        TreeNode temp=new TreeNode(0);
	        temp=root.left;
	        root.left=root.right;
	        root.right=temp;
	        return root;
	    }
}
