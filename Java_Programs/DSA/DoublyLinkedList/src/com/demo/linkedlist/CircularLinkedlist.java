package com.demo.linkedlist;



public class CircularLinkedlist {
	
	Node head,tail;
	
	
	
  public CircularLinkedlist() {
		super();
		head = null;
		tail = null;
	}

class Node{
	  int data;
	  Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = next;
	}
	
	  
	  
	  
  }
	public void addNode(int val) {
		Node newnode= new Node(val);
		if (head==null) {
			head=newnode;
			tail=newnode;
			
		}else {
			tail.next=newnode;
			tail=newnode;
			
		}
		tail.next=head;
	}

	public void addByPosition(int val, int pos) {
		if(head==null) {
			System.out.println("the list is is empty");
			
		}else {
			Node newnode= new Node(val);
			if(pos==1) {
				newnode.next=head;
				head=newnode;
				tail.next=newnode;
				
			}else {
				Node temp=head;
				int i=1;
				for(;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(i>pos-2) {
					if(temp.next==head) {
						tail=newnode;
					}
					newnode.next=temp.next;
					temp.next=newnode;
				}else {
					System.out.println("Postion is beyond limit");
				}
			}
		}
		
	}

	public void displaydata() {
		if(head==null) {
			System.out.println("List is empty...");
		}else {
				Node temp=head;
				while(temp.next!=head) {
					System.out.println(temp.data);
					temp=temp.next;
				}
				
				System.out.println(temp.data);
				System.out.println("---------------------------------------------------------------------------------");
			}
		
		
	}

}
