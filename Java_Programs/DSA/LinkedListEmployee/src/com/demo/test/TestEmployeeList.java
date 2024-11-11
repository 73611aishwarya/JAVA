package com.demo.test;

import com.demo.linkedlist.SinglyEmployeeList;
import com.demo.beans.Employee;

public class TestEmployeeList {

	public static void main(String[] args) {
		SinglyEmployeeList elist= new SinglyEmployeeList();
		
		elist.addNode(new Employee(1,"Raj","sdsd"));
		elist.addNode(new Employee(2,"Anil","fgrf"));
		elist.addNode(new Employee(3,"Riya","sddd"));
		elist.addNode(new Employee(4,"Priya","sdfds"));
		
		elist.displayData();
		//elist.deleteById(4);
		elist.deleteById(3);
		
		//elist.searchById(1);
		//elist.searchById(3);
	}

}
