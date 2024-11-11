package com.demo.linkedlist;

public class SinglySortedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	public SinglySortedList() {
		head=null;
	}
	
	public void deleteByValue(int val) {
		Node temp=head;
		if(head.data==val) {
			head=temp.next;
			temp.next=null;
			temp=null;
		}else {
			Node prev=null;
			while(temp!=null && temp.data<val) {
				prev=temp;
				temp=temp.next;
			}
			if(temp!=null && temp.data==val) {
				prev.next=temp.next;
				temp.next=null;
				temp=null;
			}else {
				System.out.println("data not found"+val);
			}
		}
	}
	
	
	

	public void displaydata() {
		if(head==null) {
			System.out.println("List is empty..");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
			System.out.println("--------------------------------------------------------------------------------");

		}
	}

	

	public void addInSortedOrder(int val) {
		Node newnode =new Node(val);
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head,prev=null;
			if(head==null) {
				head=newnode;
			}else {
				while(temp!=null && temp.data<val) {
					prev=temp;
					temp=temp.next;
				}
				newnode.next=prev.next;
				prev.next=newnode;
			}
		
	}

}
}