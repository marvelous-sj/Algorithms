package xyz.marsj.treenode;
/**101
 * 给定一个二叉树，检查它是否是镜像对称的。
      例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
    1
   / \
  2   2
 / \ / \
3  4 4  3
 * @author sj
 *
 */
public class IsSymmetric {
	public boolean isSymmetric(TreeNode root) {
        if(root==null){
        	return true;
        }
        
        return isSymm(root.left,root.right);
    }

	private boolean isSymm(TreeNode left, TreeNode right) {
		if(left==null||right==null){
			return left==right;
		}
		if(left.val!=right.val){
			return false;
		}
		return isSymm(left.left, right.right)&&isSymm(left.right, right.left);
}
}
