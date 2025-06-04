class Dll {
	static class Node {
		int data;
		Node prev,next;

		Node(int data) {
			this.data = data;
		}
	}
	private Node head = null;
	private Node tail=null;
	//insertAtBeg
	public void insertAtBeg(int data) {
		Node newNode = new Node(data);
		newNode.next = head;//as head is null
		if(head == null) {
			tail=newNode;
		}
		else {
			head.prev = newNode;
		}
		head =newNode;
	}
	//insertAtEnd
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		newNode.prev = tail;
		if(tail ==null) {
			head = newNode;
		}
		else {
			tail.next = newNode;
		}
		tail=newNode;
	}
	//deleteAtBeg
	public void deleteAtBeg() {
		head = head.next;
	}

	//deleteAtEnd
	public void deleteAtEnd() {
		Node temp = tail.prev;
		temp.next=null;
		temp=tail;
	}

	//insertAtInd
	public void insertAtInd(int data, int ind) {
		Node newNode = new Node(data);
		Node temp=head;
		for(int i =1; i<ind; i++) {
			newNode.next=temp.next;
		}
		temp.next=newNode;
		newNode.prev = temp;
	}

	//deleteAtInd
	public void deleteAtInd(int ind) {

		Node temp=head;
		for(int i =1; i<ind-1; i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}

	public void display() {
		Node temp=head;//4000
		while(temp!=null) {
			System.out.print(temp.data +"->");
			temp=temp.next;
		}
		System.out.print("null");
	}
}

public class Main
{
	public static void main(String[] args) {
		Dll obj = new Dll();
		obj.insertAtBeg(4);
		obj.insertAtEnd(9);
		obj.insertAtBeg(3);
		obj.insertAtBeg(2);
		obj.insertAtBeg(1);
		obj.display();
		System.out.println();
		obj.deleteAtEnd();
		obj.deleteAtBeg();
		obj.display();
		System.out.println();
		obj.insertAtInd(5,2);
		obj.insertAtInd(6,2);
		obj.display();
		System.out.println();
		obj.deleteAtInd(3);
		obj.display();
	}
}
