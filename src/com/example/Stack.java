package com.example;

public class Stack {
	
	private static final int DEFAULT_CAPACITY = 2;
	private int[] elements;
	private int size;
	
	public Stack() {
		elements = new int[DEFAULT_CAPACITY];
		size = 0;
	}
	
	public synchronized void push(int value) {
		if(size == elements.length) {
			resize();
		}
		elements[size++] = value;
	}
	
	public synchronized int pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is Empty");
		}
		return elements[--size];
	}
	
	public synchronized int peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is Empty");
		}
		return elements[size - 1];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	private  void resize() {
		int[] newElements = new int[elements.length * 2];
		System.arraycopy(elements, 0, newElements, 0, size);
		elements = newElements;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Top Element:"+ stack.peek());
		
		while(!stack.isEmpty()){
		System.out.println("Popped Element:"+ stack.pop());		
		}
		
		
	}

}
