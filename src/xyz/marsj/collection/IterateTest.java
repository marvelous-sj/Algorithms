package xyz.marsj.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateTest {
	public static void printfMap(HashMap<String,Integer> map){
		Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<String, Integer> next = iterator.next();
			System.out.println(next.getKey()+"====>"+next.getValue());
		}
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("1",100);
		map.put("2",200);
		map.put("3",300);
		map.put("4",400);
		printfMap(map);
	}
}
