package xyz.marsj.dp;
/** 300
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
	示例:
	输入: [10,9,2,5,3,7,101,18]
	输出: 4 
	解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * @author sj
 *
 */
public class LengthOfLIS {
	public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        if(n==0){
            return 0;
        }
        int[] res =new int[n];
        for(int i=0;i<n;i++){
            res[i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    res[i]=Math.max(res[i],res[j]+1);
                }
            }
        }
        int max=1;
        for(int i=0;i<n;i++){
            max=Math.max(max,res[i]);
        }
        return max;
    }
}
