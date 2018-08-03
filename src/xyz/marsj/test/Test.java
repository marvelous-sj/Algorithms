package xyz.marsj.test;

public class Test {
	private static void swap(int a,int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	
	public static void main(String[] args) {
		int a =5;
		int b=3;
		swap(a, b);
		System.out.println(a+"---"+b);
	}
}
