package ds;
public class Linkedlist
{
    Node head;
    void push(int data)
    {
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    
    void insert(Node prevnode,int data)
    {
        if(prevnode==null)
        {
            System.out.print("the given previous note cannot be null");
            return;
        }
        Node newnode=new Node(data);
        newnode.next=prevnode.next;
        prevnode.next=newnode;
    }
    
    void add(int data)
    {
        Node toAdd=new Node(data);
        if(isEmpty())
        {
            head=toAdd;
            return;
        }
        else
        {
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;    
            }
            last.next=toAdd;
        }
    }
   
     void print()
     {
         Node last=head;
            while(last!=null)
            {
                System.out.print(last.data +" ");
                last=last.next;
            } 
     }
      boolean isEmpty()
	{
		return head == null;
	}
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
	public static void main(String[] args) 
	{
	    Linkedlist myll=new Linkedlist();
	    myll.add(52);
	    myll.add(2);
	    myll.add(42);
	    myll.add(32);
	    myll.add(22);
	    myll.push(12);
	    myll.insert(myll.head.next,8);
	    myll.print();
	    
	}
}
