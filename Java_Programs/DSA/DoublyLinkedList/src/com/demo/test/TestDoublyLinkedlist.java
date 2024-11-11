package com.demo.test;

import com.demo.linkedlist.DoublyLinkedlist;

public class TestDoublyLinkedlist {
	public static void main(String[] args) {
		DoublyLinkedlist dlst=new DoublyLinkedlist();
		dlst.addNode(2);
		dlst.displayData();
		dlst.displayDatainReverseOrder();
		dlst.addBeforeKey(11,1);
		dlst.displayData();
		dlst.addBeforeKey(100,2);
		dlst.displayData();
		dlst.addAfterKey(33,10);
		dlst.displayData();
		dlst.deleteByPosition(2);
	}
	



}
