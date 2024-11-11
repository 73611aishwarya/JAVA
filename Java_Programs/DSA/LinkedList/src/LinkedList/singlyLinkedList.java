package LinkedList;

public class singlyLinkedList {
	
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
	public singlyLinkedList() {
		head=null;
	}

	
	public void addNode(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}


	public int SearchByValue(int val) {
		if(head==null){
			System.out.println("List is empty...");
		}else {
			Node temp=head;
			int pos=0;
			while(temp!=null && temp.data!=val) {
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
			System.out.println("List is empty...");
		}else {
			Node newNode =new Node(val);
			if(pos==1) {
				newNode.next=head;
				head=newNode;
			}else {
				Node temp=head;
				for(int i=1; temp!=null && i<pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					newNode.next=temp.next;
					temp.next=newNode;
				}else {
					System.out.println("The given position is beyond limit od list");
				}
			}
		}
	}
	
	
	public void addByValue(int val) {

	}


	public void DeleteByValue(int val) {
		if(head==null) {
			System.out.println("List is empty...");
		}else {
			Node temp=head,prev=null;
			if(head.data==val) {
				head=temp.next;
				temp.next=null;
				temp=null;
			}else {
				while(temp!=null && temp.data!=val) {
					prev=null;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
					temp=null;
				}else {
					System.out.println("data not found...");
				}
			}
		}
	}

	
	public void DeleteByPosition(int pos) {
		if(head==null) {
			System.out.println("List is empty...");
		}else {
			Node temp=head,prev=null;
			if(pos==1) {
				head=temp.next;
				temp.next=null;
				temp=null;
			}else {
				for(int i=1;temp!=null && i<pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println("position is beyond the length of list");
				}
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
			System.out.println("------------------------------------------------------------");
		}
	}


}

