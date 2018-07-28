package xyz.marsj.array;
/** 215
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
	示例 1:
	输入: [3,2,1,5,6,4] 和 k = 2
	输出: 5
 * @author sj
 *
 */
public class FindKthLargest {
	public static int findKthLargest(int[] nums, int k) {
		int l=0,r=nums.length-1;//[l,r]
		while(l<=r){
			int index = getPosition(nums,l,r);
			if(index<k-1){
				l=index+1;
			}else if(index>k-1){
				r=index-1;
			}else{
				return nums[index];
			}
		}
		return -1;
    }

	private static int getPosition(int[] nums, int l, int r) {
        int v=nums[l];
        int j=l;
        for(int i=l+1;i<=r;i++){
        	if(nums[i]>v){
        		int temp = nums[i];
				nums[i] = nums[j+1];
				nums[j+1]= temp;
				j++;
        	}
        }
        int temp = nums[l];
		nums[l] = nums[j];
		nums[j]= temp;
		return j;
	}
	public static void main(String[] args) {
		int a[]={3,2,3,1,2,4,5,5,6};
		int findKthLargest = findKthLargest(a,4);
		System.out.println(findKthLargest);
	}

}
