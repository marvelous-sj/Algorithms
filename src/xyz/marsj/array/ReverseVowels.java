package xyz.marsj.array;
/** 345
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
	示例 1：
	给定 s = "hello", 返回 "holle".
	示例 2：
	给定 s = "leetcode", 返回 "leotcede".
	注意:
	元音字母不包括 "y".
 * @author sj
 *
 */
public class ReverseVowels {
	public String reverseVowels(String s) {
	       char[] array = s.toCharArray(); 
	       int l=0,r=array.length-1;
	       while(l<r){
	    	   if(!isVowel(array[l])){
	    		   l++;
	    		   continue;
	    	   }
	    	   if(!isVowel(array[r])){
	    		   r--;
	    		   continue;
	    	   }
	    	   char temp=array[l];
	    	   array[l]=array[r];
	    	   array[r]=temp;
	           l++;r--;
	       }
		    return String.valueOf(array);
    }

	private boolean isVowel(char c) {
		char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
		for (char v : vowels) {
			if(v==c){
				return true;
			}
		}
		return false;
	}
}
