package xyz.marsj.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定一个数组{92,45,9,4,3,5}
 * 返回组成的最大字符串
 * 如99254543
 * @author sj
 *
 */
public class LargestNumber {
	public static String largestNumber(int[] num) {
		if(num == null || num.length == 0)
		    return "";
		String[] str=new String[num.length]; 
		for(int i=0;i<num.length;i++){
			str[i]=String.valueOf(num[i]);
		}
		Comparator<String> comp=new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				String s1=str1+str2;
				String s2=str2+str1;
				return s2.compareTo(s1);
			}
		};
		
		Arrays.sort(str,comp);
		StringBuilder sb = new StringBuilder();
		for(String s: str)
	            sb.append(s);
		return sb.toString();

	}
	public static void main(String[] args) {
		int a[] = new int[] {92,45,9,4,3,5};
		String largestNumber = largestNumber(a);
		System.out.println(largestNumber);
	}
}
