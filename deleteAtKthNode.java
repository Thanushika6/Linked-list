class Deletek{
    static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data=data;
        }
    }   
    private Node head=null;
    
//insertAtBeg()
public void insertAtBeg(int data){
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
}

 //delete at kth node
public void deleteAtKNode(int k)
{
   int len = 0;
    Node temp=head;
    while (temp != null)
    {
    len++;
    temp = temp.next;
    }

    for (int i = len / k; i >= 1; i--)
    {
        deleteAtInd(i * k); 
    }

}

//deleteAtInd
public void deleteAtInd(int ind)
{
    Node temp=head;
    
    for(int i=1;i<ind-1;i++)
    {
        temp=temp.next;
    }
    temp.next=temp.next.next;   
}

//display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }System.out.print("null");
    }
}
    
    
 public class Main{   
    public static void main(String[] args){
        Deletek sl=new Deletek();
       sl.insertAtBeg(9); 
       sl.insertAtBeg(8); 
       sl.insertAtBeg(7);
       sl.insertAtBeg(6); 
    sl.insertAtBeg(5); 
        sl.insertAtBeg(4); 
        sl.insertAtBeg(3); 
        sl.display();
        System.out.println();
       sl.deleteAtKNode(2);
       sl.display();
       }
}
