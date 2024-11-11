package com.demo.test;

import com.demo.queue.MyArrayQueue;

public class TestMyArrayQueue {

	public static void main(String[] args) {
		MyArrayQueue Qarr=new MyArrayQueue(5);
		Qarr.enqueue(11);
		Qarr.enqueue(12);
		Qarr.enqueue(13);
		Qarr.enqueue(14);
		Qarr.enqueue(15);
		Qarr.enqueue(16);

		while(!Qarr.isEmpty()) {
			System.out.println("Data:"+Qarr.dequeue());
		}
	}
}
