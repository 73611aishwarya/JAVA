package com.demo.queue;

import java.util.Arrays;
import com.demo.beans.Customer;

public class MyCircularQueueCustomer {
	Customer []arr;
	int front;
	int rear;

	public MyCircularQueueCustomer() {
		front=-1;
		rear=-1;
		arr=new Customer[10];
	}


	public MyCircularQueueCustomer(int size) {
		front=-1;
		rear=-1;
		arr=new Customer[size];
	}


	public boolean isFull() {
		if(front==0 && rear==arr.length-1)
			return true;
		if(front==rear+1)
			return true;
		return false;
	}


	public boolean isEmpty() {
		return  front==-1;
	}


	public void enqueue(Customer val) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		if(front==-1)
			front=0;
		rear=(rear+1) % arr.length;
		arr[rear]=val;
		System.out.println(Arrays.toString(arr));	
	}


	public Customer dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			Customer n=arr[front];
			if(front==rear){
				front=-1;
				rear=-1;
			}else {
				front=(front+1)%arr.length;
			}
			System.out.println(Arrays.toString(arr));
			return n; 
		}
		System.out.println(Arrays.toString(arr));
		return null;
	}
}