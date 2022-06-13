package com.kiddy.dataStructure;

public class CQueue<T> {

	/*
	 * CQueue
	 * @Author LwinPhyoAung(codeCat)
	 * 
	 * Methods :	enqueue(T val)
	 * 				dequeue() : T
	 * 
	 * 				isEmpty() : boolean
	 * 				isFull() : boolean
	 * 				size() : int
	 * 				printQueue()
	 */
	
	private int front = 0;
	private int rear = -1;
	private int maxSize;
	private int counter = 0;
	
	private Object[] queue;
	
	public CQueue(int size){
		queue = new Object[size];
		maxSize = size;
	}
	
	public void enqueue(T element){
		
		if(isFull()){
			System.out.println("Queue Is Full!");
			return;
		}
		
		rear = (rear + 1) % maxSize;
		queue[rear] = element;
		counter += 1;
		
	}
	
	public T dequeue(){
		
		T result = null;
		if(isEmpty()){
			System.out.println("Queue is Empty!");
			return result;
		}else{
		result = (T)queue[front];
		front = (front + 1) % maxSize;
		counter -= 1;
		}
		return result;
		
	}
	
	public boolean isEmpty(){
		return counter == 0;
	}
	
	public boolean isFull(){
		return counter == maxSize;
	}
	
	public int size(){
		return counter;
	}
	
	public void printQueue(){
		
		System.out.println();
		for (Object object: queue) {
			System.out.print(" " + object + " ");
		}
		System.out.println();
		
	}
	
}
