package com.demo.test;

import com.demo.linkedlist.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList lst= new SinglyLinkedList();
		lst.addNode(2);
		lst.addNode(3);
		lst.addNode(4);
		lst.addNode(1);
		lst.displaydata();
		lst.addByPosition(100, 2);
		lst.displaydata();
		lst.addByPosition(200,1);
		lst.displaydata();
		lst.addByPosition(300, 3);
	    lst.displaydata();
	    lst.addByPosition(400, 4);
	    lst.displaydata();
	    lst.deleteByValue(400);
	    lst.deleteByPosition(3);
	    lst.displaydata();
	    
		
		
		
				
	}

}
