package xyz.marsj.test;

public class Test {
	public static void main(String[] args) {
		MyLinkedList<Integer> list = MyLinkedList.newEmptyList();
		for(int i=0;i<20;i++){
			list.add(i);
		}
		for (Integer i : list) {
			System.out.println(i);
		}
		

		MyLinkedList<String> string = MyLinkedList.newEmptyList();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<20;i++){
			sb.append('s');
			string.add(sb.toString());
		}
		for (String i : string) {
			System.out.println(i);
		}
	
	}
	
}
