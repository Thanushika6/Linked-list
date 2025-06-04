class Middle {
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	private Node head = null;

//insertAtBeg
	public void insertAtBeg(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}

//middle Element
	public void middle() {
		Node fast=head;
		Node slow=head;
		while(fast.next!=null && fast.next.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.print(slow.data);

	}

//display
	public void display() {
		Node temp = head;
		while(temp !=null) {
			System.out.print(temp.data+"->");
			temp =temp.next;
		}
		System.out.print("null");
	}


}
public class Main
{
	public static void main(String[] args) {
		Middle m = new Middle();
		m.insertAtBeg(1);
        m.insertAtBeg(2);	
        m.insertAtBeg(3);
		m.insertAtBeg(4);
		m.insertAtBeg(5);
		m.insertAtBeg(6);
		m.insertAtBeg(7);
		m.display();
		System.out.println();
		System.out.println("The middle element is");
		m.middle();


	}
}
