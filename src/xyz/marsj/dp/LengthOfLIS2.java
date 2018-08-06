package xyz.marsj.dp;
/**300改
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
	示例:
	输入: [10,9,2,5,3,7,101,18]
	输出: 其中一个最长上升子序列 
	解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * @author sj
 *
 */
public class LengthOfLIS2 {
    public int[] lengthOfLIS(int[] nums) {
        int n= nums.length;
        if(n==0){
            return null;
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
        int[] choose=new int[max];
        for(int i=n-1;i>=0;i--){
        	if(max==res[i]){
        		max--;
        		choose[max]=nums[i];
        	}
        }
        return choose;
    }
    public static void main(String[] args) {
		LengthOfLIS2 lis=new LengthOfLIS2();
		int[] nums={1,5,2,3,6,4,7,3,2,8,6,10,9};
		int[] i = lis.lengthOfLIS(nums);
		for (int j : i) {
			System.out.println(j);
		}
		
	}
}
