package xyz.marsj.dp;

import java.util.Arrays;
import java.util.Comparator;

import xyz.marsj.greedy.Interval;
/**
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
	注意:
	可以认为区间的终点总是大于它的起点。
	区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
	示例 1:
	输入: [ [1,2], [2,3], [3,4], [1,3] ]
	输出: 1
	解释: 移除 [1,3] 后，剩下的区间没有重叠。
 * @author sj
 *
 */
public class EraseOverlapIntervals {
	public int eraseOverlapIntervals(Interval[] intervals) {
		
		Comparator<Interval> cmp=new Comparator<Interval>() {
			@Override
			public int compare(Interval a, Interval b) {
				if(a.start!=b.start){
					return a.start<b.start?-1:1;
				}
				return  a.end<b.end?-1:1;
			}
		};
		Arrays.sort(intervals,cmp);
		int memo[]=new int[intervals.length];
		for(int i=0;i<memo.length;i++){
			memo[i]=1;
		}
		
		for(int i=1;i<memo.length;i++){
			for(int j=0;j<i;j++){
				if(intervals[i].start>=intervals[j].end){
					memo[i]=Math.max(memo[i], memo[j]+1);					
				}
			}
		}
		
		int max=0;
		for(int i=0;i<memo.length;i++){
			max=Math.max(max,memo[i]);
		}
		return intervals.length-max;
        
    }
	
	public static void main(String[] args) {
		Interval a=new Interval(1, 5);
		Interval b=new Interval(3, 6);
		Interval c=new Interval(5, 5);
		Interval d=new Interval(3, 5);
		Interval e=new Interval(3, 3);
		Interval[] x={a,b,c,d,e};
		EraseOverlapIntervals ea=new EraseOverlapIntervals();
		int i = ea.eraseOverlapIntervals(x);
		System.out.println(i);
	
	}
}
