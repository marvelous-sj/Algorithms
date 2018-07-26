package xyz.marsj.array;
/**
 * 
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
说明:
初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:
输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
输出: [1,2,2,3,5,6]
 * @author sj
 *
 */
public class Merge {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m-1,y=n-1;
        for(int i=m+n-1;i>=0;i--){
        	if(y<0){
        		return;
        	}
        	if(x<0){
        		nums1[i]=nums2[y];
        		y--;
        		continue;
        	}
        	if(nums1[x]<nums2[y]){
        		nums1[i]=nums2[y];
        		y--;
        	}else{
        		nums1[i]=nums1[x];
        		x--;
        	}
        }
    }
	public static void main(String[] args) {
		int a[]={0};
		int b[]={1};
		merge(a, 0, b, 1);
		for (int i : a) {
			System.out.println(i);
			
		}
	}
	
}
