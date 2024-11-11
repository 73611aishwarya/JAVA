package com.demo.test;

import com.demo.linkedlist.CircularLinkedlist;

public class TestCircular {

	public static void main(String[] args) {
		CircularLinkedlist clist=new CircularLinkedlist();
		clist.addNode(22);
		clist.addNode(31);
		clist.addNode(46);
		clist.addNode(1);
		clist.displaydata();
		
		clist.addByPosition(100,2);
		clist.displaydata();
		clist.addByPosition(200,3);
		clist.displaydata();
		clist.addByPosition(300,4);
		clist.displaydata();
		clist.addByPosition(400,1);
		clist.displaydata();
		
	}

}
