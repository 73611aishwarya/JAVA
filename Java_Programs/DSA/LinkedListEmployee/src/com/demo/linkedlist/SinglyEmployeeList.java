package com.demo.linkedlist;

import com.demo.beans.Employee;

public class SinglyEmployeeList {
	Node head;

	class Node{
		Employee Data;
		Node next;

		public Node(Employee data) {
			super();
			this.Data = data;
			this.next = null;
		}
	}

	public SinglyEmployeeList() {
		super();
		this.head = null;

	}



	public void addNode(Employee ob) {
		Node newnode=new Node(ob);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;


		}
	}


	public void deleteById(int id) {
		Node temp=head;
		if(head.Data.getEmpid()==id)
		{
			head=temp.next;
			temp.next=null;
			temp=null;

		}else {
			Node prev=null;
			while(temp!=null && temp.Data.getEmpid()!=id)
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp.Data.getEmpid()==id) {
				prev.next=temp.next;
				temp.next=null;
				temp=null;
			} else {
				System.out.println("Id not found!!"+id);
			}
		}

	}

	public void searchById(int id) {
		Node temp =head;
		while(temp!=null && temp.Data.getEmpid()!=id) {
			temp=temp.next;



		}
		if(temp!=null && temp.Data.getEmpid()==id) {
			System.out.println("temp.data");
		}else {
			System.out.println("Id nit found!!"+id);
		}
	}
	public void displayData() {
		Node temp=head;
		if(head!=null) {
			while(temp!=null) {
				System.out.println(temp.Data);
				temp=temp.next;


			}
		}
	}
}
