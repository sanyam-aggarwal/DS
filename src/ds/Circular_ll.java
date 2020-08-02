package ds;

public class Circular_ll 
{
	 public class Node
	 {  
	        int data;  
	        Node next;  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
	
	Node head=null;
	Node tail=null;
	void add(int d)
	{
		Node newnode=new Node(d);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
			newnode.next=head;
		}
		else
		{
			Node temp=head;
			newnode.next=temp;
			head=newnode;
			tail.next=newnode;
		}
	}
	public void display()
	{
		  Node temp = head;
		  do {
			   System.out.print(" " + temp.data);
			   temp = temp.next;
			  }
		  while(temp != head);
	}
	
	
	

	public static void main(String[] args) 
	{
		Circular_ll cll=new Circular_ll();
		cll.add(2);
		cll.add(5);
		cll.add(7);
		cll.add(6);
		cll.display();
	}

}
