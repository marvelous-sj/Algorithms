package xyz.marsj.dp;

import java.util.ArrayList;
import java.util.List;
/**
 * 01背包递归求解
 * @author sj
 *
 */
public class Knapsack01 {
	int[][] memo;
	public int knapsack01(List<Integer> w,List<Integer> v,int C){
		memo=new int[w.size()][C+1];
		return bestChoose(w,v,w.size()-1,C);
		 
	}

	private int bestChoose(List<Integer> w, List<Integer> v, int index, int c) {
		if(index<0||c<=0){
			return 0;
		}
		if(memo[index][c]!=0){
			return memo[index][c];
		}
		int res=bestChoose(w, v, index-1, c);
		if(c>=w.get(index))
			res=Math.max(v.get(index)+bestChoose(w, v, index-1, c-w.get(index)),res);
		memo[index][c]=res;
		return res;
		
	}
	
	public static void main(String[] args) {
		List<Integer> w=new ArrayList<Integer>();
		List<Integer> v=new ArrayList<Integer>();
		w.add(1);
		w.add(2);
		w.add(3);
		v.add(6);
		v.add(10);
		v.add(12);
		Knapsack01 k=new Knapsack01();
		int i = k.knapsack01(w, v,5);
		System.out.println(i);
	}
}
