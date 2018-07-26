package xyz.marsj.array;
/**
 *  给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
	示例:
	输入: [0,1,0,3,12]
	输出: [1,3,12,0,0]
 * @author sj
 *
 */
public class MoveZero {

	public static int[] moveZero (int nums[]){
		int x=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				if(x!=i){
					int temp = nums[x];
					nums[x] = nums[i];
					nums[i]= temp;
					x++;
				}else{
					x++;
				}
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int arry[]={5,0,0,1,2,3,0,9};
		int[] moveZero = moveZero(arry);
		for (int i : moveZero) {
			System.out.println(i);
		}
	}
}
