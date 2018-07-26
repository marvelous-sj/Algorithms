package xyz.marsj.array;
/**	80
	给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
	不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
	示例 1:
	给定 nums = [1,1,1,2,2,3],
	函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
	你不需要考虑数组中超出新长度后面的元素。
  * @author sj
 **/
public class RemoveDuplicates2 {
	 public static int  removeDuplicates(int[] nums) {
		int x=0;
		for(int i=0;i<nums.length;i++){
			if(nums[x]!=nums[i]){
				if((i-x)<=2){
					x=i;
				}else{
					int temp = nums[x+2];
					nums[x+2] = nums[i];
					nums[i]= temp;
					x++;
				}
			
			}
		}
		return x+2;
	    }
	
	public static void main(String[] args) {

		int arry[]={0,0,0,0,0};
		int i = removeDuplicates(arry);
		for(int z=0;z<i;z++){
			System.out.println(arry[z]);
		}
	}


}
