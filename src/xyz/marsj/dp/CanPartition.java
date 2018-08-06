package xyz.marsj.dp;
/** 416
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
	注意:
	每个数组中的元素不会超过 100
	数组的大小不会超过 200
	示例 1:
	输入: [1, 5, 11, 5]
	输出: true
解释: 数组可以分割成 [1, 5, 5] 和 [11].
 * @author sj
 *
 */
public class CanPartition {
	  public boolean canPartition(int[] nums) {
		  int sum = 0;
		  
		  int n=nums.length;
	        for(int i=0;i<n;i++){
	        	sum+=nums[i];
	        }
	        if(sum%2!=0)
	        	return false;
	        //看做填充容量为C的背包
	        int C=sum/2;
	        boolean [] memo = new boolean[C+1];
	        for(int i=0;i<=C;i++){
	        	memo[i]=(i==nums[0]);
	        }
	        for(int i=1;i<n;i++){
	        	for(int j=C;j>=nums[i];j--){
	        		memo[j]=memo[j]||memo[j-nums[i]];
	        	}
	        }
			return memo[C];
	        
	        
	    }
}
