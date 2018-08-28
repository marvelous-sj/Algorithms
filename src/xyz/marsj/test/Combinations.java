package xyz.marsj.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
	 static List<List<Integer>> res=new ArrayList<>();
	public static  void combinations(List<Integer> com,int index,int c,List<Integer> list){
		if(c==list.size()){
			res.add(new ArrayList<>(list));
			return;
		}
		for(int i=index;i<com.size();i++){
			list.add(com.get(i));
			combinations(com,i+1,c,list);
			list.remove(list.size()-1);
		}
		
	}
	public static void main(String[] args) {
		 List<Integer> list=new ArrayList<>();
		combinations(Arrays.asList(1,2,3,4,5), 0, 2, list);
		for (List<Integer> i : res) {
			System.out.println(i);
		}
	}
}
