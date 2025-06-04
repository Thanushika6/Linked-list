class Reverse{
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
        }
    }
    private Node head =null;
    
    //insertAtBeg
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next=head;
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
    
    //Reverse
    public void reverse(){
        Node prev=null;
        Node curr = head;
        Node temp;
        while(curr !=null){
            
            temp=curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
    }
}
    
    public class Main{
        public static void main(String[] args){
            Reverse obj = new Reverse();
            obj.insertAtBeg(1);
            obj.insertAtBeg(2);
            obj.insertAtBeg(3);
            obj.insertAtBeg(4);
            obj.insertAtBeg(5);
            obj.display();
            System.out.println();
            obj.reverse();
            obj.display();
    }
}
