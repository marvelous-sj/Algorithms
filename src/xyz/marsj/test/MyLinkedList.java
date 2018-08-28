package xyz.marsj.test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T>{
	private Node<T> head;
	private Node<T> tail;
	public static <T> MyLinkedList<T> newEmptyList(){
		return new MyLinkedList<T>();
	}
	private MyLinkedList() {
		head=null;
		tail=null;
	}
	public void add(T value){
		Node<T> node =new Node<T>(value);
		if(tail==null){
			head=node;
		}else{
			tail.setNext(node);
		}
		tail=node;
	}
	
	private class MyIterator implements Iterator<T>{
		private Node<T> node;
		public MyIterator(Node<T> node) {
			this.node=node;
		}
		@Override
		public boolean hasNext() {
			return node.getNext()!=null;
		}

		@Override
		public T next() {
			if(node==null){
				throw new NoSuchElementException();
			}
			T value=node.getValue();
			node=node.getNext();
			return value;
		}
		
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(head);
	}
	
}
