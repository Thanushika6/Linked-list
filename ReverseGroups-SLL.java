class RevGroup{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    } 
    private Node head = null;
    
    //insertAtBeg
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
    }
    
    //display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    //reversebygroup
    public static Node group(Node head, int k){
        Node curr = head;
        Node next = null;
        Node prev = null;
        int count=0;
        while(curr!=null && count<k){
        next = curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        count++;
    }
    if(next!=null){
        head.next=group(next,k);
        
    }
    return prev;
    }
     public void ReverseGroups(int n){
        head=group(head,n);
    }
}

public class Main
{
	public static void main(String[] args) {
	RevGroup rv = new RevGroup();
	rv.insertAtBeg(1);
	rv.insertAtBeg(2);
	rv.insertAtBeg(3);
	rv.insertAtBeg(4);
	rv.insertAtBeg(5);
	rv.insertAtBeg(6);
	rv.display();
	System.out.println();
	rv.ReverseGroups(3);
	rv.display();

	}
}
