package xyz.marsj.array;
/** 344
 * 请编写一个函数，其功能是将输入的字符串反转过来。
	示例：
	输入：s = "hello"
	返回："olleh"
 * @author sj
 *
 */
public class ReverseString {
	public String reverseString(String s) {
	       char[] array = s.toCharArray(); 
	       int l=0,r=array.length-1;
	       while(l<r){
	    	   char temp=array[l];
	    	   array[l]=array[r];
	    	   array[r]=temp;
	           l++;r--;
	       }
		    return String.valueOf(array);
    }
}
