package com.demo.linkedlist;


import com.demo.beans.Employee;

public class SinglyLinkedList {
	class Node{
		int Data;
		Node next;

		public Node(int data) {
			super();
			this.Data = data;
			this.next = null;
		}
	}
	Node head;

	public SinglyLinkedList() {
		head=null;
	}

	public void addNode(int val) {
		Node NewNode =new Node(val);
		if(head==null) {
			head=NewNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=NewNode;
		}
	}

	public int searchbyvalue(int val) {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			Node temp=head;
			int pos=0;
			while(temp!=null && temp.Data!=val) {
				temp=temp.next;
				pos++;
			}
			if(temp!=null) {
				return pos;
			}

		}
		return -1;
	}


	public void addByPosition(int val,int pos) {
		if(head==null && pos>1) {
			System.out.println("list is empty");
		}else {
			Node newnode=new Node(val);

			if(pos==1) {
				newnode.next=head;
				head=newnode;
			}else {
				Node temp=head;
				for(int i=1;temp!=null && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					newnode.next=temp.next;
					temp.next=newnode;
				}else {
					System.out.println("The given position beyond the limit of list");
				}
			}
		}
	}
	public void addByValue(int val) {

	}


	public void deleteByValue(int val) {

		if(head==null) {
			System.out.println("the list is empty");
		}else {
			Node temp=head, prev=null;

			if(head.Data==val) {
				head=temp.next;
				temp.next=null;
				temp=null;
			}else {

				while(temp!=null && temp.Data!=val) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
					temp=null;
				}else {
					System.out.println("data not found");
				}
			}
		}

	}

	public void deleteByPosition(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head,prev=null;
			if(pos==1) {
				head=temp.next;
				temp.next=null;
				temp=null;
			}else {
				for(int i=1;temp!=null && i<=pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
					temp=null;
				}else {
					System.out.println("position is beyond the length of the list");
				}
			}
		}
	}


	public void displaydata() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.Data+"  ");
				temp=temp.next;
			}
			System.out.println("------------------------------------------");
		}
	}

}


