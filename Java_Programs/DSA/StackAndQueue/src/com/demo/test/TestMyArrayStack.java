package com.demo.test;

import com.demo.stack.MyArrayStack;

public class TestMyArrayStack {

	public static void main(String[] args) {
	MyArrayStack St=new MyArrayStack(5);
	St.push(12);
	St.push(15);
	St.push(13);
	St.push(30);
	St.push(10);
	St.push(40);
	while(!St.isEmpty()) {
		System.out.println("value:"+St.pop());
	}
	

	}

}
