package com.demo.test;

import com.demo.linkedlist.SinglySortedList;

public class TestSinglySortedlist {

	public static void main(String[] args) {
		SinglySortedList lst=new SinglySortedList();
		lst.addInSortedOrder(5);
		lst.addInSortedOrder(9);
		lst.addInSortedOrder(7);
		
		lst.deleteByValue(12);
		lst.displaydata();
		
	}

	

}
