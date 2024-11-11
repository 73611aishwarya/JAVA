package com.demo.test;

import LinkedList.singlyLinkedList;

public class TestSinglyLinkedList {
	
public static void main(String[] args) {
	singlyLinkedList lst=new singlyLinkedList();
	lst.addNode(3);
	lst.addNode(5);
	lst.addNode(7);
	lst.addNode(8);
	lst.displaydata();
	
	lst.addByPosition(100, 2);
	lst.displaydata();
	
	
}
}
