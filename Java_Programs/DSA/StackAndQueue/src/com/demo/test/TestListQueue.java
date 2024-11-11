package com.demo.test;

import com.demo.queue.MyListQueue;

public class TestListQueue {
	public static void main(String[] args) {
		MyListQueue Qlist =new MyListQueue();
		Qlist.enqueue(23);
		Qlist.enqueue(12);
		Qlist.enqueue(55);
		Qlist.enqueue(271);
		Qlist.enqueue(20);
		while(!Qlist.isEmpty()) {
			System.out.println("Data:"+Qlist.dequeue());
		}
	}
}
